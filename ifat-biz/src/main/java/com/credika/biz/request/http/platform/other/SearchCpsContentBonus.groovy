package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class SearchCpsContentBonus extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ShareOrderManage/searchCpsContentBonus"
        super.params =  ["page","rows","condition"]
    }

    SearchCpsContentBonus invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchCpsContentBonus preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchCpsContentBonus baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
