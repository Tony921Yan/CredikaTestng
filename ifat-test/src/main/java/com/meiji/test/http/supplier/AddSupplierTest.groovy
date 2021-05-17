package com.meiji.test.http.supplier

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.suppiler.AddSubject
import com.meiji.request.http.suppiler.AddSupplier
import org.testng.annotations.Test

class AddSupplierTest extends BaseTest {
    AddSupplier  addSupplier = new AddSupplier()
    @Test(description = "添加供应商基础信息 addSupplier" ,groups = ["prod","uat"],testName = "addSupplier",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addSupplier(TestContext testContext){
        addSupplier.invoke(testContext).baseAssert(testContext)
    }
}
