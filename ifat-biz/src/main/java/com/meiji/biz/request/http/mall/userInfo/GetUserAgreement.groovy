package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetUserAgreement extends MallPost {
    {
        super.api = "/userInfo/getUserAgreement"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetUserAgreement invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetUserAgreement preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetUserAgreement baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
