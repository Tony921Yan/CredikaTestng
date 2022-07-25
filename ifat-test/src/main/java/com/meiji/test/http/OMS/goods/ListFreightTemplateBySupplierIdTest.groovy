package com.meiji.test.http.OMS.goods

import com.meiji.biz.request.http.OMS.goods.ListFreightTemplateBySupplierId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListFreightTemplateBySupplierIdTest extends BaseTest {
    ListFreightTemplateBySupplierId listFreightTemplateBySupplierId = new ListFreightTemplateBySupplierId()
    @Test(description = "商品详情-运费模板 listFreightTemplateBySupplierId" ,groups = ["prod","uat"],testName = "listFreightTemplateBySupplierId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void listFreightTemplateBySupplierId(TestContext testContext){
        listFreightTemplateBySupplierId.invoke(testContext).baseAssert(testContext)
    }
}

