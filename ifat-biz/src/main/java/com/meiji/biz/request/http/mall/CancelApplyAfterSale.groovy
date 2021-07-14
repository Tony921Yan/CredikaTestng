package com.meiji.biz.request.http.mall

import com.miyuan.ifat.support.test.TestContext

class CancelApplyAfterSale extends MallPost {
    {
        super.api = "/orderAfterSale/cancelApplyAfterSale"
        super.params =  ["afterCode","id","orderCode","orderGoodsId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
