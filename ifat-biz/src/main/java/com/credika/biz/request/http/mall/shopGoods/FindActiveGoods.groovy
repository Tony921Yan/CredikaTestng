package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindActiveGoods extends MallPost {
    {
        super.api = "shopGoods/findActiveGoods"
        super.params =  ["page","rows","activeType","activeStatus","shopId"]
    }

    FindActiveGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindActiveGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindActiveGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
