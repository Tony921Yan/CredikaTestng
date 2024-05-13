package com.credika.biz.request.http.OMS.goods

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetGoodsByPage  extends OMSPost{

    {
        super.api = "GoodsDetailManage/getGoodsByPage"
        super.params =[ "status","pageNum","pageSize","supplierId"]

    }
    GetGoodsByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
}

    GetGoodsByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
