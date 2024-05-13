package com.credika.biz.request.http.platform.aftersalesDetailManage


import com.miyuan.ifat.support.test.TestContext

class Cancel extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "AftersalesDetailManage/cancel"
        super.params =  ["orderAfterCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    Cancel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Cancel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Cancel baseAssert(TestContext testContext){
        assert testContext.getResponse().msg == '不能取消该售后单(00005)'
        assert testContext.getResponse().code == 10
        return this
    }

}
