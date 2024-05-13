package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetResourceWithCategory extends MallPost {
    {
        super.api = "shopGoods/getResourceWithCategory"
        super.params =  ["categoryId"]
    }

    GetResourceWithCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetResourceWithCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetResourceWithCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
