package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/12 22:30
 @version v2.1
 */
class SearchBuyerShow extends PlatformPost {
    {
        super.api = "ShareOrderManage/searchBuyerShow"
        super.params =  ["page","rows","columnId"]
    }

    SearchBuyerShow invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchBuyerShow preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchBuyerShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
