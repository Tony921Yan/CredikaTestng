package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SearchCpsContentBonus extends PlatformPost {
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
