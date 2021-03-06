package com.meiji.request.http.category

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class GetCategoryByName extends MeijiRequest{
    {
        super.api = "/platform/categoryMgr/getCategoryByName"
        super.params = [["name","type"]]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }
}
