package com.meiji.request.http.order

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiGet
import com.meiji.request.http.MeijiRequest

class GetOrderDetail extends MeijiGet {
    {
        super.api = "/platform/orderMgr/getOrderDetail"
        super.params =  [ "id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
