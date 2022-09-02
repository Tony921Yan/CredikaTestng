package com.meiji.biz.request.http.platform.memeberDayConfig

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class MemberDayConfigSubmit extends PlatformPost{
    {
        super.api="/MemeberDayConfig/memberDayConfigSubmit"
        super.params = ["beginTime","endTime","repeatDate","defaultPic","enabled","goodsDetailPic","integralMultiplier","rightsDisplayPic","virtualSubscriberCount","activeHeadPic"]
    }

    MemberDayConfigSubmit invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MemberDayConfigSubmit preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MemberDayConfigSubmit baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}