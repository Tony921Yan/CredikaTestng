package com.meiji.test.http.shop.shopauth

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.shopauth.DeleteAfterOrder
import com.meiji.request.http.shop.shopauth.UpdateShopInfo
import org.testng.annotations.Test

class DeleteAfterOrderTest extends BaseTest {
    DeleteAfterOrder deleteAfterOrder = new DeleteAfterOrder()
    @Test(description = "删除售后单记录 deleteAfterOrder" ,groups = ["prod","uat"],testName = "deleteAfterOrder",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteAfterOrder(TestContext testContext){
        deleteAfterOrder.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
