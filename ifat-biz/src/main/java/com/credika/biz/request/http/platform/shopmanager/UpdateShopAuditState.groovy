package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class UpdateShopAuditState extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/platform/shopMgr/updateShopAuditState"
        super.params =  [ "auditState","reason","shopId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    UpdateShopAuditState invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateShopAuditState preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateShopAuditState baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
