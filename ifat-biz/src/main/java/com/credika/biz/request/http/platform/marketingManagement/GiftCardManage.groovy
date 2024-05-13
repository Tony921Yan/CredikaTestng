package com.credika.biz.request.http.platform.marketingManagement


import com.miyuan.ifat.support.test.TestContext

class GiftCardManage extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "GiftCardManage/listGiftCard"
        super.params =  [ "pageNum","pageSize"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GiftCardManage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GiftCardManage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GiftCardManage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
