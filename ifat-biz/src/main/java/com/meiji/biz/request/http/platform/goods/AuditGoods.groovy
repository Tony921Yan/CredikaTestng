package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class AuditGoods extends PlatformPost{
    {
        super.api = "GoodsDetailManage/auditGoods"
        super.params = ["auditStuats","message","spuId","updateById","updateByName"]
    }

    AuditGoods invoke(TestContext testContext) {
        MysqlService.auditGoods(testContext.get("spuId"))
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
