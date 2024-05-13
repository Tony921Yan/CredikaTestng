package com.credika.biz.request.http.platform.decorate


import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/18-20:00
 @version v2.1
 */
class GetDecorateTemplateDetail extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "Decorate/getDecorateTemplateDetail"
        super.params =  ["id"]
    }

    GetDecorateTemplateDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetDecorateTemplateDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetDecorateTemplateDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
