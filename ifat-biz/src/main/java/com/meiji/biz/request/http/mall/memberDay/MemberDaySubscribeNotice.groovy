package com.meiji.biz.request.http.mall.memberDay
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class MemberDaySubscribeNotice extends MallPost {
    {
        super.api = "active/memberDaySubscribeNotice"
        super.params =  ["subscribeActiveId","shopId","subscribeBeginTime"]
    }

    MemberDaySubscribeNotice invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MemberDaySubscribeNotice preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MemberDaySubscribeNotice baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
