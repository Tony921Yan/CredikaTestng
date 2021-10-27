package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AuditGoods extends PlatformPost{
    {
        super.api = "/platform/goodsMgr/auditGoods"
        super.params = ["auditStuats","message","spuId","updateById","updateByName"]
    }

    AuditGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AuditGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AuditGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
