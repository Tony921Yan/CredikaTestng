package com.meiji.request.http.category

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateCategoryById extends MeijiRequest{
    {
        super.api = "/platform/categoryMgr/updateCategoryById"
        super.params = [["list"]]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
