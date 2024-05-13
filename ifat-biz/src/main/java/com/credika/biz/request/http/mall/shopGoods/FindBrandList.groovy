package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindBrandList extends MallPost {
    {
        super.api = "/shopGoods/findBrandList"
        super.params =  ["page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindBrandList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindBrandList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindBrandList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
        return this
        return this
    }
}
