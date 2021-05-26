package com.meiji.test.http.platform.supplier


import com.meiji.biz.request.http.platform.suppiler.GetSupplierByPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetSupplierByPageTest extends BaseTest {
    GetSupplierByPage getSupplierByPage = new GetSupplierByPage()
    @Test(description = "获取供应商列表 getSupplierByPage" ,groups = ["prod","uat"],testName = "getSupplierByPage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSupplierByPage(TestContext testContext){
        getSupplierByPage.invoke(testContext).baseAssert(testContext)
    }
}
