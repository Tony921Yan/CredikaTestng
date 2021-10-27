package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetGiftDetailToMe extends MallPost {
    {
        super.api = "gift/getGiftDetailToMe"
        super.params =  ["giftId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetGiftDetailToMe invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGiftDetailToMe baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
