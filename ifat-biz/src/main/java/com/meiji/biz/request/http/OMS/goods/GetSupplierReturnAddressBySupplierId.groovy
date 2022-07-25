package com.meiji.biz.request.http.OMS.goods
import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetSupplierReturnAddressBySupplierId extends OMSPost{
    {
        super.api = "SupplierManage/getSupplierReturnAddressBySupplierId"
        super.params =["id"]

    }
    GetSupplierReturnAddressBySupplierId invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    GetSupplierReturnAddressBySupplierId preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSupplierReturnAddressBySupplierId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
