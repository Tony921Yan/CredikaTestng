package com.credika.biz.request.http.platform.applicationList


import com.miyuan.ifat.support.test.TestContext

class GetCompensationListByPage extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ApplicationList/getCompensationListByPage"
        super.params =  [ "condition","page","rows"]
    }

    GetCompensationListByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCompensationListByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetCompensationListByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

 /*   GetOrderAfterByPage specialAssert(TestContext testContext){
         Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this

    }*/
}
