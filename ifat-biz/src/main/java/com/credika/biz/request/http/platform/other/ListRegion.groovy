package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class ListRegion extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/platform/freightTemplate/listRegion"
        super.params =  [ "level","pcode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ListRegion invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ListRegion preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ListRegion baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
