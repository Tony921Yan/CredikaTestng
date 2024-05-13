package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetAllOneCategorys extends MallPost {
    {
        super.api = "shopGoods/getAllOneCategorys"
        super.params =  [ ]
    }

    GetAllOneCategorys invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetAllOneCategorys preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetAllOneCategorys baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
