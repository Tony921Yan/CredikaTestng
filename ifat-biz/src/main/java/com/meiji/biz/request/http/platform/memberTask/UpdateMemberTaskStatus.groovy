package com.meiji.biz.request.http.platform.memberTask

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateMemberTaskStatus extends PlatformPost {
    {
        super.api = "TaskManage/updateMemberTaskStatus"
        super.params =  [ "id","taskStatus"]

    }

    UpdateMemberTaskStatus invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateMemberTaskStatus preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateMemberTaskStatus baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
