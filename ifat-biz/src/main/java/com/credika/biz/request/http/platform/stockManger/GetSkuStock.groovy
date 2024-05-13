package com.credika.biz.request.http.platform.stockManger


import com.miyuan.ifat.support.test.TestContext

class GetSkuStock extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="StockManage/getSkuStock"
        super.params = ["activityId","skus","skuId","spuId"]
    }

    GetSkuStock invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSkuStock preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSkuStock baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
