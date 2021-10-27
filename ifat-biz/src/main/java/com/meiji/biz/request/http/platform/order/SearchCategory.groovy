package com.meiji.biz.request.http.platform.order

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SearchCategory extends PlatformPost {//美粉圈分类管理
    {
        super.api = "MaterialCategoryManagement/searchCategory"
        super.params =  []
    }
    SearchCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
    SearchCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }
    SearchCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
