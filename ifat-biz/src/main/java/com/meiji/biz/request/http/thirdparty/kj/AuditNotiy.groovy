package com.meiji.biz.request.http.thirdparty.kj

import com.meiji.biz.request.http.shop.ShopGet
import com.miyuan.ifat.support.test.TestContext

class AuditNotiy extends KJPost{
    {
        super.api = "/thirdparty/kj/auditNotiy"
        super.params =  [ "msgType","userCode","msgId","msgData","msgDigest"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    KJPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    KJPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    KJPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
