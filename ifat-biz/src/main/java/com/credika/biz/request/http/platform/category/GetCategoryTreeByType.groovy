package com.credika.biz.request.http.platform.category


import com.miyuan.ifat.support.test.TestContext

class GetCategoryTreeByType extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "GoodsDetailManage/getCategoryTreeByType"
        super.params = ["type"]
    }

    GetCategoryTreeByType invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetCategoryTreeByType preInvoke(TestContext testContext) {
        super.preInvoke(testContext)
        return this
    }

    GetCategoryTreeByType baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        return this
    }

}
