package com.credika.test.http.platform.activeMainManage

import com.credika.biz.request.http.platform.activeMainManage.GetPromotionalInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetPromotionalInfoTest extends BaseTest{
    GetPromotionalInfo getPromotionalInfo = new GetPromotionalInfo()
    @Test(description ="活动管理-获取商品推广信息 getPromotionalInfo" ,groups = ["prod","uat"],testName = "getPromotionalInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void additionalBonds(TestContext testContext) {
        getPromotionalInfo.invoke(testContext).baseAssert(testContext)
    }
}
