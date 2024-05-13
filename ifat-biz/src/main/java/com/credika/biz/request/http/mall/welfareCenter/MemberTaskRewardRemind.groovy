package com.credika.biz.request.http.mall.welfareCenter

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class MemberTaskRewardRemind extends MallPost {
    {
        super.api ="welfareCenter/memberTaskRewardRemind" //接口地址
        super.params =  []  //请求参数
    }

    MemberTaskRewardRemind invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MemberTaskRewardRemind preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MemberTaskRewardRemind baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
