package com.credika.biz.request.http.platform.finance


import com.miyuan.ifat.support.test.TestContext

class GetChannelList extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="Channel/getChannelList"
        super.params = [""]
    }

    GetChannelList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetChannelList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetChannelList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
