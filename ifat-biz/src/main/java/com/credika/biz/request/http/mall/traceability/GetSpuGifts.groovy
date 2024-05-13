package com.credika.biz.request.http.mall.traceability

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetSpuGifts extends MallPost{
    {
        super.api = "traceability/getSpuGifts"
        super.params = ["spuId"]
    }

    GetSpuGifts invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetSpuGifts preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetSpuGifts baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
