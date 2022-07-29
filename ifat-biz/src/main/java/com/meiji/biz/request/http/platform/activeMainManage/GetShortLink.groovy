package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetShortLink extends PlatformPost{
    {
        super.api = "ActiveMainManage/getShortLink"   //接口地址
        super.params = ["pageTitle","pageUrl","isPermanent"]   //接口参数
    }

    GetShortLink invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetShortLink preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetShortLink baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
