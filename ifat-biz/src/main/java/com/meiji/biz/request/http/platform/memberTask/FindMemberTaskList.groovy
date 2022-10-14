package com.meiji.biz.request.http.platform.memberTask

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class FindMemberTaskList extends PlatformPost {
    {
        super.api = "TaskManage/findMemberTaskList"
        super.params =  [ "condition","page","limit"]

    }

    FindMemberTaskList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindMemberTaskList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindMemberTaskList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
