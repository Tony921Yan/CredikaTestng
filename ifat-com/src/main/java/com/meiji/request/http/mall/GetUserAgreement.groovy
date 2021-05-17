package com.meiji.request.http.mall

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiGet

class GetUserAgreement extends MeijiGet {
    {
        super.api = "/mall/user/agreement/getUserAgreement"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MeijiGet invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiGet preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiGet baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
