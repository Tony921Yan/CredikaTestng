package com.credika.biz.request.http.mall.material

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetMaterialCategory extends MallPost {
    {
        super.api = "material/getMaterialCategory"
        super.params =  ["page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetMaterialCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMaterialCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMaterialCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
