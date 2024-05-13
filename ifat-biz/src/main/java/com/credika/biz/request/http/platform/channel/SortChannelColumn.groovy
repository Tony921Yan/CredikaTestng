package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext

class SortChannelColumn extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ColumnManagement/updateSort"
        super.params =  ["id","sort"]
    }

    SortChannelColumn invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SortChannelColumn preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SortChannelColumn baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
