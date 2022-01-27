package com.meiji.biz.request.http.platform.integral

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class EditTask extends PlatformPost{
    {
        super.api="/TaskManage/editTask"
        super.params = ["browseTime","rewardPoints","taskName","taskLimitTimes","taskType","taskLogo","title","taskStatus","firstTimeFlag","signInList","id","linkPage","linkPageDesc"]
    }

    EditTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    EditTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    EditTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}