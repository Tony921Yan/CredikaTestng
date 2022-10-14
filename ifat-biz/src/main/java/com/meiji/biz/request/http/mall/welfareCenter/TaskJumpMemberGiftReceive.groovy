package com.meiji.biz.request.http.mall.welfareCenter

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class TaskJumpMemberGiftReceive extends MallPost {
    {
        super.api ="welfareCenter/taskJumpMemberGiftReceive" //接口地址
        super.params =["id"]  //请求参数
    }

    TaskJumpMemberGiftReceive invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    TaskJumpMemberGiftReceive preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    TaskJumpMemberGiftReceive baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
