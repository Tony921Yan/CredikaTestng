package com.meiji.test.http.platform.goods

import com.meiji.biz.request.http.platform.goods.ListFreightTemplateBySupplierId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListFreightTemplateBySupplierIdTest extends BaseTest {
    ListFreightTemplateBySupplierId listFreightTemplateBySupplierId = new ListFreightTemplateBySupplierId()
    @Test(description = "供应商运费模块列表-商品详情 listFreightTemplateBySupplierId", groups = ["prod", "uat"], testName = "listFreightTemplateBySupplierId",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void listFreightTemplateBySupplierId(TestContext testContext) {
        listFreightTemplateBySupplierId.invoke(testContext).baseAssert(testContext)
    }
}