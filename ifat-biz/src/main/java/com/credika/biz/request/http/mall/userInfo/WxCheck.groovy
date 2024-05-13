package com.credika.biz.request.http.mall.userInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class WxCheck extends MallPost {
    {
        super.api = "login/wxCheck"
        super.params =  [ "code","appId","inviteUserId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    WxCheck invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    WxCheck preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    WxCheck baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    WxCheck specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }
}
