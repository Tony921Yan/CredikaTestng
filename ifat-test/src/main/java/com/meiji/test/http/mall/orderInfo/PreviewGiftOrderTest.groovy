package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.PreviewGiftOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PreviewGiftOrderTest extends BaseTest {
    PreviewGiftOrder previewGiftOrder = new PreviewGiftOrder()
    @Test(description = "预览送礼订单 previewGiftOrder" ,groups = ["prod","uat"],testName = "previewGiftOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void previewGiftOrder(TestContext testContext){
        previewGiftOrder.invoke(testContext).baseAssert(testContext)
    }
}
