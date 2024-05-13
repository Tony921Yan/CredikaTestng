package com.credika.biz.request.http.platform.activeMainManage.giftAdvManage


import com.miyuan.ifat.support.test.TestContext

class GiftAdvManageEdit extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GiftAdvManage/edit"
        super.params = ["id","pic","targetType","target","targetActiveType"]
    }

    GiftAdvManageEdit invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GiftAdvManageEdit preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GiftAdvManageEdit baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
