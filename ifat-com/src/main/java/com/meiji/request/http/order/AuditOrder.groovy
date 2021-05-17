package com.meiji.request.http.order

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest
import com.meiji.service.MysqlService
import com.meiji.util.DateUtil


class AuditOrder extends MeijiRequest {
    {
        super.api = "/platform/orderMgr/auditOrder"
        super.params =  [ "auditById","auditByName","auditByName","auditMethod","auditStatus","auditType","gmtCreate","id","orderCode","remark"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
