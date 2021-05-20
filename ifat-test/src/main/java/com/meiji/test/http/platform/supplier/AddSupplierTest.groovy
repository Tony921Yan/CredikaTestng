package com.meiji.test.http.platform.supplier

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.platform.suppiler.AddSupplier
import org.testng.annotations.Test

class AddSupplierTest extends BaseTest {
    AddSupplier  addSupplier = new AddSupplier()
    @Test(description = "添加供应商基础信息 addSupplier" ,groups = ["prod","uat"],testName = "addSupplier",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addSupplier(TestContext testContext){
        addSupplier.invoke(testContext).baseAssert(testContext)
    }
}
