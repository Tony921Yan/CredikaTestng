package com.credika.biz.request.http.platform.aftersalesDetailManage


import com.miyuan.ifat.support.test.TestContext

class GetOrderAfterDetail extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "AftersalesDetailManage/getOrderAfterDetail"
       super.params = ["orderAfterCode"]
    }

    GetOrderAfterDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderAfterDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderAfterDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
