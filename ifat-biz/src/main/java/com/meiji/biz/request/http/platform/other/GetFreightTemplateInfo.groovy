package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetFreightTemplateInfo extends PlatformPost {
    {
        super.api = "/platform/freightTemplate/getFreightTemplateInfo"
        super.params =  [ "id","supplierId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetFreightTemplateInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetFreightTemplateInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetFreightTemplateInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
