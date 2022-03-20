package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession V2.6.3
 * */
class GetLongUrl extends MallPost {
    {
        super.api = "share/getLongUrl"
        super.params =  ["shortUrl"]
    }

    GetLongUrl invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetLongUrl preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetLongUrl baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetLongUrl specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }
}
