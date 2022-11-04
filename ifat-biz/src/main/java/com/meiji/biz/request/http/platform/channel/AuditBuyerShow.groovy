package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AuditBuyerShow extends PlatformPost {
    {
        super.api = "ShareOrderManage/auditBuyerShow"
        super.params =  ["auditData","auditStatus","columnId","needHomePageShow","needColumnPageShow","needGiveBonus","traceTitle"]
    }

    AuditBuyerShow invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AuditBuyerShow preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AuditBuyerShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
