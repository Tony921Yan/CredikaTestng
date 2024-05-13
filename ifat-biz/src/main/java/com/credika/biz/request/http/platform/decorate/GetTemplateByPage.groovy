package com.credika.biz.request.http.platform.decorate


import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/18-20:00
 @version v2.1
 */
class GetTemplateByPage extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "Decorate/getTemplateByPage"
        super.params =  ["page","rows","condition","order"]
    }

    GetTemplateByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetTemplateByPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetTemplateByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
