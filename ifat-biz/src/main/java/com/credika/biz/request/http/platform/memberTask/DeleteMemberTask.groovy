package com.credika.biz.request.http.platform.memberTask


import com.miyuan.ifat.support.test.TestContext

class DeleteMemberTask extends com.credika.biz.request.http.platform.PlatformPost {
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
