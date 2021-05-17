package com.meiji.biz.request.http.orderafter


import com.miyuan.ifat.support.test.TestContext

class Cancel extends com.meiji.biz.request.http.MeijiGet {
    {
        super.api = "/platform/orderMgr/cancel?orderAfterCode=R2021033110280305195"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    com.meiji.biz.request.http.MeijiGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    com.meiji.biz.request.http.MeijiGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    com.meiji.biz.request.http.MeijiGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
