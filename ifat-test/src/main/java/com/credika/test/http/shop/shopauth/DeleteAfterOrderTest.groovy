package com.credika.test.http.shop.shopauth

import com.credika.biz.request.http.shop.shopauth.DeleteAfterOrder
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteAfterOrderTest extends BaseTest {
    DeleteAfterOrder deleteAfterOrder = new DeleteAfterOrder()
    @Test(description = "删除售后单记录 deleteAfterOrder" ,groups = ["prod","uat"],testName = "deleteAfterOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteAfterOrder(TestContext testContext){
        deleteAfterOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
