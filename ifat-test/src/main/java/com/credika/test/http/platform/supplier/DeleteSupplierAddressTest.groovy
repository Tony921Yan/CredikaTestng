package com.credika.test.http.platform.supplier
import com.credika.biz.request.http.platform.suppiler.DeleteSupplierAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
class DeleteSupplierAddressTest extends BaseTest { //supplier_return_address 直接物理删除
    DeleteSupplierAddress deleteSupplierAddress = new DeleteSupplierAddress()
    @Test(description = "删除供应商退货地址 deleteSupplierAddress" ,groups = ["prod","uat"],testName = "deleteSupplierAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteSupplierAddress(TestContext testContext){
        deleteSupplierAddress.invoke(testContext).baseAssert(testContext)
    }
}
