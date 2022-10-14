package com.meiji.biz.request.http.mall.welfareCenter

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class MemberTaskFinshRemind extends MallPost {
    {
        super.api ="welfareCenter/memberTaskRewardRemind" //接口地址
        super.params =  []  //请求参数
    }

    MemberTaskFinshRemind invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MemberTaskFinshRemind preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MemberTaskFinshRemind baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
