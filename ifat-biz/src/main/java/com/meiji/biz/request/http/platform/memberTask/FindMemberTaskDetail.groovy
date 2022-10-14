package com.meiji.biz.request.http.platform.memberTask

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FindMemberTaskDetail extends PlatformPost {
    {
        super.api = "TaskManage/findMemberTaskDetail"
        super.params =  [ "id"]

    }

    FindMemberTaskDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindMemberTaskDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindMemberTaskDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
