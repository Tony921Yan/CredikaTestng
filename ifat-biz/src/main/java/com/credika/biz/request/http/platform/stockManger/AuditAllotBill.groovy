package com.credika.biz.request.http.platform.stockManger


import com.miyuan.ifat.support.test.TestContext
class AuditAllotBill extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="StockManage/auditAllotBill"
        super.params = ["adjustId","adjustStatus"]
    }

    AuditAllotBill invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AuditAllotBill preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AuditAllotBill baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
