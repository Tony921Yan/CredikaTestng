package com.meiji.biz.request.http.platform.memberTask

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddMemberTask extends PlatformPost {
    {
        super.api = "TaskManage/addMemberTask"
        super.params =  [ "taskName","taskViceTitle","taskLogo","taskClass","taskContent","taskCycle","taskLimitTimes","taskStatus","taskUserTypeLimit","taskButtonContent","taskOrderby","taskNeedCompleteTimes","linkPageType","linkPageUrl","taskRefreshTime","rewardInfoList","id"]

    }

    AddMemberTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddMemberTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddMemberTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
