package com.meiji.test.http.mall


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PreviewOrderTest extends BaseTest {
    com.meiji.biz.request.http.mall.PreviewOrder previewOrder = new com.meiji.biz.request.http.mall.PreviewOrder()
    @Test(description = "预览订单 previewOrder" ,groups = ["prod","uat"],testName = "previewOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void previewOrder(TestContext testContext){
        previewOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
