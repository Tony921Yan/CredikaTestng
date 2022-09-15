package com.meiji.biz.request.http.mall.memberDay
import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetMemberDayActiveList extends MallPost {
    {
        super.api = "active/getMemberDayActiveList"
        super.params =  ["shopId"]
    }

    GetMemberDayActiveList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMemberDayActiveList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMemberDayActiveList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
