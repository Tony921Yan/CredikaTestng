package com.credika.biz.request.http.mall.home

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class GetSearchKeys extends MallPost {
    {
        super.api = "home/getSearchKeys"
        super.params =  []   //无入参
    }

    GetSearchKeys invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSearchKeys preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSearchKeys baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
