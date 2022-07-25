package com.meiji.biz.request.http.OMS.goods
import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class ListFreightTemplateBySupplierId extends OMSPost{
    {
        super.api = "SupplierManage/listFreightTemplateBySupplierId"
        super.params =["supplierId"]

    }
    ListFreightTemplateBySupplierId invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    ListFreightTemplateBySupplierId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ListFreightTemplateBySupplierId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
