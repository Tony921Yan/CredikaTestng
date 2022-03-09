package com.meiji.biz.request.http.mall.gift

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class CheckAddress extends MallPost {
    {
        super.api = "/gift/checkAddress"
        super.params =  ["addressId","giftId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    CheckAddress invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CheckAddress baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
