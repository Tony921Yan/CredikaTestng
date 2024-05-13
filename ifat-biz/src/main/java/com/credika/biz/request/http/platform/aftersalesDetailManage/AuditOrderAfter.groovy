package com.credika.biz.request.http.platform.aftersalesDetailManage


import com.miyuan.ifat.support.test.TestContext

class AuditOrderAfter extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "AftersalesDetailManage/auditOrder"
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
        assert testContext.getResponse().code == 10
        assert testContext.getResponse().msg =='只能审核状态为待审核的售后单(00005)'
        return this
    }

}
