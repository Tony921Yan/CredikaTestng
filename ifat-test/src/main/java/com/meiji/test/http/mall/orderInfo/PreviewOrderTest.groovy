package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.PreviewOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PreviewOrderTest extends BaseTest {
    PreviewOrder previewOrder = new PreviewOrder()
    @Test(description = "预览订单 previewOrder" ,groups = ["uat"],testName = "previewOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void previewOrder(TestContext testContext){
        previewOrder.invoke(testContext).baseAssert(testContext)
    }
}
