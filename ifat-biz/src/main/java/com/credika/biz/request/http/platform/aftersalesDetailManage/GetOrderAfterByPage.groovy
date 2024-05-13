package com.credika.biz.request.http.platform.aftersalesDetailManage


import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterByPage extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "AftersalesDetailManage/getOrderByPage"
        super.params =  [ "condition","order","page","rows","sort"]
    }

    GetOrderAfterByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderAfterByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderAfterByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

 /*   GetOrderAfterByPage specialAssert(TestContext testContext){
         Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this

    }*/
}
