package com.credika.biz.request.http.mall.gift

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGroupGoods extends MallPost {
    {
        super.api ="gift/getGroupGoods" //接口地址
        super.params =  ['categoryId']  //请求参数
    }

    GetGroupGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGroupGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
