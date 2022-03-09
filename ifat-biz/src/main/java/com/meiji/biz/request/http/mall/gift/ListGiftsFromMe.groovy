package com.meiji.biz.request.http.mall.gift

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ListGiftsFromMe extends MallPost {
    {
        super.api = "gift/listGiftsFromMe"
        super.params =  ["page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ListGiftsFromMe invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ListGiftsFromMe baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
