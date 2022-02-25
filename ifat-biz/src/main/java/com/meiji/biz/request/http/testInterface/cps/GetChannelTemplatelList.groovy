package com.meiji.biz.request.http.testInterface.cps

import com.miyuan.ifat.support.test.TestContext

class GetChannelTemplatelList extends CpsPost {
    {
        super.api = "thirdparty/api/cps/getChannelTemplatelList"
        super.params =  ["userId"]
    }

    GetChannelTemplatelList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetChannelTemplatelList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetChannelTemplatelList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
