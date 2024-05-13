package com.credika.test.http.platform.supplier


import com.credika.biz.request.http.platform.suppiler.ListFreightTemplateBySupplierId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListFreightTemplateBySupplierIdTest extends BaseTest {
    ListFreightTemplateBySupplierId listFreightTemplateBySupplierId = new ListFreightTemplateBySupplierId()
    @Test(description = "根据供应商ID获取供应商运费模板 listFreightTemplateBySupplierId" ,groups = ["prod","uat"],testName = "listFreightTemplateBySupplierId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void listFreightTemplateBySupplierId(TestContext testContext){
        listFreightTemplateBySupplierId.invoke(testContext).baseAssert(testContext)
    }
}
