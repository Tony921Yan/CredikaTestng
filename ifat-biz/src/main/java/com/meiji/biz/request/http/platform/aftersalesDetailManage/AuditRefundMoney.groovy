package com.meiji.biz.request.http.platform.aftersalesDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AuditRefundMoney extends PlatformPost {
    {
        super.api = "AftersalesDetailManage/auditRefundMoney"
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
        assert testContext.getResponse().msg == '只能审核状态为待退款审核的售后单(00005)'
        assert testContext.getResponse().code == 10
        return this
    }

}
