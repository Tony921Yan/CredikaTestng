package com.credika.biz.request.http.OMS.aftersale


import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterDetail extends OMSPost {
    {
        super.api = "AftersalesDetailManage/getOrderAfterDetail"
        super.params =  [ "supplierId","orderAfterCode"]

    }

    GetOrderAfterDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderAfterDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderAfterDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
