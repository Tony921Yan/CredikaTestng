package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/12 22：30
 @version v2.3
 */
class SearchContentBonus extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ShareOrderManage/searchContentBonus"
        super.params =  ["page","rows","recStatus"]
    }

    SearchContentBonus invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchContentBonus preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchContentBonus baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
