package com.credika.test.http.mall.orderInfo

import com.credika.biz.request.http.mall.orderInfo.PreviewOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PreviewOrderTest extends BaseTest {
    PreviewOrder previewOrder = new PreviewOrder()
    @Test(description = "预览订单 previewOrder" ,groups = ["prod","uat"],testName = "previewOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void previewOrder(TestContext testContext){
        previewOrder.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "预览订单 previewOrder-订阅" ,groups = ["prod","uat"],testName = "previewOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void previewOrder1(TestContext testContext){
        previewOrder.invoke(testContext).baseAssert(testContext)
    }
}
