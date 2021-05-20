package com.meiji.biz.request.http.mall

import com.miyuan.ifat.support.test.TestContext

class GetUserAgreement extends MallGet {
    {
        super.api = "/mall/user/agreement/getUserAgreement"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
