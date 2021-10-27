package com.meiji.biz.request.http.platform.orderafter

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AuditOrderAfter extends PlatformPost {
    {
        super.api = "/platform/orderMgr/auditOrderAfter"
        super.params =  [ "orderAfterCode","pass","reason"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    AuditOrderAfter invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AuditOrderAfter preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AuditOrderAfter baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
