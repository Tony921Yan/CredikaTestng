package com.meiji.biz.request.http.mall.user

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class IsSubscribe extends MallPost {
    {
        super.api = "user/isSubscribe"
        super.params =  ["openId","appId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    IsSubscribe invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    IsSubscribe preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    IsSubscribe baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    IsSubscribe specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }
}
