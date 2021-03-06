package com.meiji.request.http.category

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class GetCategoryTreeByType extends MeijiRequest{
    {
        super.api = "/platform/categoryMgr/getCategoryTreeByType"
        super.params = [["type"]]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
