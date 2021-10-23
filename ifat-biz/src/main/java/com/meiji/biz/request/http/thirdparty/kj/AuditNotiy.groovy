package com.meiji.biz.request.http.thirdparty.kj


import com.miyuan.ifat.support.test.TestContext

class AuditNotiy extends KjPost{
    {
        super.api = "/thirdparty/kj/auditNotiy"
        super.params =  [ "msgType","userCode","msgId","msgData","msgDigest"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    KjPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    KjPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    KjPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
