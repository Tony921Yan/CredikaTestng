package com.credika.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class MiyuanOrder extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/miyuanOrder"
        super.params =  ["oid"]
    }

    MiyuanOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MiyuanOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MiyuanOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
