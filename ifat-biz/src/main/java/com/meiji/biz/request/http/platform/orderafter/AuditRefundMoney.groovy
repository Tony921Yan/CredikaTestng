package com.meiji.biz.request.http.platform.orderafter

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AuditRefundMoney extends PlatformPost {
    {
        super.api = "/platform/orderMgr/auditRefundMoney"
        super.params =  [ "orderAfterCode","pass","realRefundMoney","reason"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    AuditRefundMoney invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AuditRefundMoney preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AuditRefundMoney baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
