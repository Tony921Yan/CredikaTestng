package com.credika.biz.request.http.platform.live
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateGoods extends PlatformPost{
    {
        super.api="Platform/updateGoods"
        super.params = ["priceType","price","goodsId"]
    }

    UpdateGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
