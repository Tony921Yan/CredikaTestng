package com.credika.biz.request.http.mall.welfareCenter

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class MemberTaskQuery extends MallPost {
    {
        super.api = "/welfareCenter/memberTaskQuery"
        super.params =  []
    }

    MemberTaskQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MemberTaskQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MemberTaskQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
