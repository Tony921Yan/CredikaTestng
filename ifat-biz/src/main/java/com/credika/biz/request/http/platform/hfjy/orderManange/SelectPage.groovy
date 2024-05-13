package com.credika.biz.request.http.platform.hfjy.orderManange


import com.miyuan.ifat.support.test.TestContext

class SelectPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/platform/order/transport/selectPage"
        super.params = ["condition","page","rows"]
    }

    SelectPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SelectPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SelectPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}