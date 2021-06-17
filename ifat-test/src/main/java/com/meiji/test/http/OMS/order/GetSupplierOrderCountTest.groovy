package com.meiji.test.http.OMS.order



import com.meiji.biz.request.http.OMS.order.GetSupplierOrderCount
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierOrderCountTest extends BaseTest {
    GetSupplierOrderCount getSupplierOrderCount = new GetSupplierOrderCount()
    @Test(description = "订单红点计数 getSupplierOrderCount" ,groups = ["prod","uat"],testName = "OMSgetSupplierOrderCount",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSupplierOrderCount(TestContext testContext){
        getSupplierOrderCount.invoke(testContext).baseAssert(testContext)
    }
}
