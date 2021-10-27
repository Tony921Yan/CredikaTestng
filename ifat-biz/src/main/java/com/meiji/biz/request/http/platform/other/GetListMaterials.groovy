package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetListMaterials extends PlatformPost {
    {
        super.api = "MaterialList/getListMaterials"
        super.params =  [ "page","rows","sort","order","condition"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetListMaterials invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetListMaterials preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetListMaterials baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetListMaterials specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
