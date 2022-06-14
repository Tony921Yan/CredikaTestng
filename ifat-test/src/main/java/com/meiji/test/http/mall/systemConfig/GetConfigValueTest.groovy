package com.meiji.test.http.mall.systemConfig


import com.meiji.biz.request.http.mall.systemConfig.GetConfigValue
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetConfigValueTest extends BaseTest {
    GetConfigValue getConfigValue = new GetConfigValue()
    @Test(description = "查询系统配置属性-官方店铺配置 getConfigValue" ,groups = ["prod","uat"],testName = "getConfigValue-officalShop",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getConfigValue(TestContext testContext){
        getConfigValue.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询系统配置属性-商详开通会员营销文案 getConfigValue" ,groups = ["prod","uat"],testName = "getConfigValue-goodsDetailTips",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getConfigValue1(TestContext testContext){
        getConfigValue.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "查询系统配置属性-个人中心开通会员营销文案 getConfigValue" ,groups = ["prod","uat"],testName = "getConfigValue-vipCenterTips",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getConfigValue2(TestContext testContext){
        getConfigValue.invoke(testContext).baseAssert(testContext)
    }
}