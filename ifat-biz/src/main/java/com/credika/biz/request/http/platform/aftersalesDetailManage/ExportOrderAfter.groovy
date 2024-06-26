package com.credika.biz.request.http.platform.aftersalesDetailManage


import com.miyuan.ifat.support.test.TestContext

class ExportOrderAfter extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "AftersalesDetailManage/exportOrderAfter"
        super.params =  [ "condition","order","page","rows","sort"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ExportOrderAfter invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ExportOrderAfter preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ExportOrderAfter baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
