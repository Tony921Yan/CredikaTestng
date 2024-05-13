package com.credika.biz.request.http.platform.integral


import com.miyuan.ifat.support.test.TestContext

class AddTask extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="TaskManage/addTask"
        super.params = ["taskName","guaranteedIntegral","browseTime","rewardPoints","taskLimitTimes","taskType","taskLogo","title","taskStatus","firstTimeFlag","signInList","linkPage","linkPageDesc","isSignGift"]
    }

    AddTask invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddTask preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddTask baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}