package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.PreviewOrder
import org.testng.annotations.Test

class PreviewOrderTest extends BaseTest {
    PreviewOrder previewOrder = new PreviewOrder()
    @Test(description = "预览订单 previewOrder" ,groups = ["prod","uat"],testName = "previewOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void previewOrder(TestContext testContext){
        previewOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
