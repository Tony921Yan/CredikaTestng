package com.credika.biz.request.http.mall.shopGoods

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetVirtualBarrageList extends MallPost {
    {
        super.api = "shopGoods/getVirtualBarrageList"
        super.params =  ["action","number"]
    }

    GetVirtualBarrageList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetVirtualBarrageList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetVirtualBarrageList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
