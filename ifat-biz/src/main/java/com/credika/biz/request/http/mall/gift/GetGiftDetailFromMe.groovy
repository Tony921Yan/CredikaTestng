package com.credika.biz.request.http.mall.gift

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGiftDetailFromMe extends MallPost {
    {
        super.api = "/gift/getGiftDetailFromMe"
        super.params =  ["giftId","page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetGiftDetailFromMe invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGiftDetailFromMe baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
