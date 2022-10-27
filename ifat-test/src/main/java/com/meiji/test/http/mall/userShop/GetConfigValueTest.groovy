package com.meiji.test.http.mall.userShop

import com.meiji.biz.request.http.mall.userShop.GetConfigValue
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author remy
 @create 2021/11/16-10:50
 */
class GetConfigValueTest extends BaseTest{
    GetConfigValue getConfigValue = new GetConfigValue()
    @Test(description = "美粉圈开关 getConfigValue" ,groups = ["prod","uat"],testName = "getConfigValueForUserShop",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getConfigValue(TestContext testContext){
        getConfigValue.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "品牌墙开关 getConfigValue" ,groups = ["prod","uat"],testName = "getConfigValue-isShowBrand",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getConfigValue2(TestContext testContext){
        getConfigValue.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "送礼鲜花配置 getConfigValue" ,groups = ["prod","uat"],testName = "getConfigValue-isShowGiftFlower",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getConfigValue3(TestContext testContext){
        getConfigValue.invoke(testContext).baseAssert(testContext)
    }
}
