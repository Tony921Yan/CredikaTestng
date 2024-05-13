package com.credika.test.http.OMS.goods

import com.credika.biz.request.http.OMS.goods.GetSupplierReturnAddressBySupplierId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierReturnAddressBySupplierIdTest extends BaseTest {
    GetSupplierReturnAddressBySupplierId getSupplierReturnAddressBySupplierId = new GetSupplierReturnAddressBySupplierId()
    @Test(description = "商品详情-供应商退货地址 getSupplierReturnAddressBySupplierId" ,groups = ["prod","uat"],testName = "getSupplierReturnAddressBySupplierId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getSupplierReturnAddressBySupplierId(TestContext testContext){
        getSupplierReturnAddressBySupplierId.invoke(testContext).baseAssert(testContext)
    }
}

