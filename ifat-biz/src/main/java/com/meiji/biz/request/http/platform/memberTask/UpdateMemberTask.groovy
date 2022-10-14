package com.meiji.biz.request.http.platform.memberTask

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateMemberTask extends PlatformPost {
    {
        super.api = "TaskManage/updateMemberTask"
        super.params =  [ "taskName","taskViceTitle","taskLogo","taskClass","taskContent","taskCycle","taskLimitTimes","taskStatus","taskUserTypeLimit","taskButtonContent","taskOrderby","taskNeedCompleteTimes","linkPageType","linkPageUrl","taskRefreshTime","rewardInfoList","id"]

    }

    UpdateMemberTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateMemberTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateMemberTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
