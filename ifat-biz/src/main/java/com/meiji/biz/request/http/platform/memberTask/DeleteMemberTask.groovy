package com.meiji.biz.request.http.platform.memberTask

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class DeleteMemberTask extends PlatformPost {
    {
        super.api = "TaskManage/deleteMemberTask"
        super.params =  ["id"]

    }

    DeleteMemberTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    DeleteMemberTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    DeleteMemberTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
