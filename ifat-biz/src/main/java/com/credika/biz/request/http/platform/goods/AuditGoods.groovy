package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
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
