package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext

class UpdateBuyer extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ShareOrderManage/updateBuyer"
        super.params =  ["businessType","pics","cover","id","text","title","isOfficial"]
    }

    UpdateBuyer invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateBuyer preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateBuyer baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
