package com.meiji.biz.request.http.thirdparty.kj


import com.miyuan.ifat.support.test.TestContext

class AuditNotiy extends KjPost{
    {
        super.api = "/thirdparty/kj/auditNotiy"
        super.params =  [ "msgType","userCode","msgId","msgData","msgDigest"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    AuditNotiy invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AuditNotiy preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AuditNotiy baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
