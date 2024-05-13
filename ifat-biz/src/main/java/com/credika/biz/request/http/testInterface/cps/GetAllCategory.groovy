package com.credika.biz.request.http.testInterface.cps

import com.miyuan.ifat.support.test.TestContext

class GetAllCategory extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/getAllCategory"
        super.params =  ["userId"]
    }

    GetAllCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetAllCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetAllCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
