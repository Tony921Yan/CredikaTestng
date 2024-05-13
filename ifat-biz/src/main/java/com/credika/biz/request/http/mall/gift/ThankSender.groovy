package com.credika.biz.request.http.mall.gift

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ThankSender extends MallPost {
    {
        super.api = "gift/thankSender"
        super.params =  ["text","url","giftId","userId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ThankSender invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ThankSender baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
