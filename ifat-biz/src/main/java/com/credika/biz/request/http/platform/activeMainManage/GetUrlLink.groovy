package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class GetUrlLink extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ActiveMainManage/getUrlLink"       //接口地址
        super.params = ["pageUrl","urlLinkIsExpire"]    //接口参数
    }

    GetUrlLink invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetUrlLink preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetUrlLink baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
