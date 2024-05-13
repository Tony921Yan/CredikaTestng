package com.credika.biz.request.http.platform.memeberDayConfig


import com.miyuan.ifat.support.test.TestContext

class MemberDayConfigSubmit extends com.credika.biz.request.http.platform.PlatformPost{
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