package com.credika.biz.request.http.platform.goodsDetailManage


import com.miyuan.ifat.support.test.TestContext

class ShowSales extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "GoodsDetailManage/showSales"
       super.params = []
    }

    ShowSales invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ShowSales preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ShowSales baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
