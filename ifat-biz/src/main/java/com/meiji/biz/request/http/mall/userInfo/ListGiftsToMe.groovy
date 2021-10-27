package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class ListGiftsToMe extends MallPost {
    {
        super.api = "gift/listGiftsToMe"
        super.params =  ["page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    ListGiftsToMe invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ListGiftsToMe baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
