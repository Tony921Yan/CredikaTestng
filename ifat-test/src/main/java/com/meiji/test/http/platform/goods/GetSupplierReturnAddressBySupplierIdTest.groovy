package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.GetSupplierReturnAddressBySupplierId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierReturnAddressBySupplierIdTest extends BaseTest {
    GetSupplierReturnAddressBySupplierId getSupplierReturnAddressBySupplierId = new GetSupplierReturnAddressBySupplierId()
    @Test(description = "供应商退货地址列表-商品详情 getSupplierReturnAddressBySupplierId", groups = ["prod", "uat"], testName = "getSupplierReturnAddressBySupplierId",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void getSupplierReturnAddressBySupplierId(TestContext testContext) {
        getSupplierReturnAddressBySupplierId.invoke(testContext).baseAssert(testContext)
    }
}