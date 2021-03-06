package com.meiji.request.http.category

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class DelCategoryById extends MeijiRequest{
    {
        super.api = "/platform/categoryMgr/delCategoryById"
        super.params = [["id"]]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
