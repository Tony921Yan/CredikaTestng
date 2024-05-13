package com.credika.test.http.platform.supplier
import com.credika.biz.request.http.platform.suppiler.UpdateSupplier
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateSupplierTest extends BaseTest {
    UpdateSupplier updateSupplier = new UpdateSupplier()
    @Test(description = "更新供应商基础信息 updateSupplier" ,groups = ["prod","uat"],testName = "updateSupplier",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateSupplier(TestContext testContext){
        updateSupplier.invoke(testContext).baseAssert(testContext)
    }
}
