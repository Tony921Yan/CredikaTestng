package com.meiji.test.http.platform.marketingManagement

import com.meiji.biz.request.http.platform.marketingManagement.GiftCardManage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GiftCardManageTest extends BaseTest {
    GiftCardManage giftCardManage = new GiftCardManage()
    @Test(description = "卡片管理 giftCardManage" ,groups = ["prod","uat"],testName = "giftCardManage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void giftCardManage(TestContext testContext){
        giftCardManage.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
