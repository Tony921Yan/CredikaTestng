package com.meiji.biz.request.http.platform.stockManger
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
class AuditAllotBill extends PlatformPost{
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
