package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext

class ChannelColumnDelete extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ColumnManagement/deleteColumn"
        super.params =  [ "id"]
    }

    ChannelColumnDelete invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ChannelColumnDelete preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ChannelColumnDelete baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 0
        return this
    }

}
