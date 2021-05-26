package com.meiji.test.http.platform.supplier

import com.meiji.biz.request.http.platform.suppiler.AddSupplierAddress
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddSupplierAddressTest extends BaseTest {
    AddSupplierAddress addSupplierAddress = new AddSupplierAddress()
    @Test(description = "新增供应商收货地址 addSupplierAddress" ,groups = ["prod","uat"],testName = "addSupplierAddress",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addSupplierAddress(TestContext testContext){
        addSupplierAddress.invoke(testContext).baseAssert(testContext)
    }
}
