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
}
