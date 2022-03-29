package com.meiji.test.http.platform.supplier
import com.meiji.biz.request.http.platform.suppiler.UpdateSupplierAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateSupplierAddressTest extends BaseTest {
    UpdateSupplierAddress updateSupplierAddress = new UpdateSupplierAddress()
    @Test(description = "更新供应商收货地址 updateSupplierAddress" ,groups = ["prod","uat"],testName = "updateSupplierAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateSupplierAddress(TestContext testContext){
        updateSupplierAddress.invoke(testContext).baseAssert(testContext)
    }
}
