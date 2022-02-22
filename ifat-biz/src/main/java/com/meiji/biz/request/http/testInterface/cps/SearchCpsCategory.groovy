package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

import java.util.stream.Collectors

class SearchCpsCategory extends CpsPost {
    {
        super.api = "/thirdparty/api/cps/searchCpsCategory"
        super.params =  ["userId"]
    }

    SearchCpsCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchCpsCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchCpsCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    static List getCpsCategoryIds(TestContext testContext){
        List<Map> categoryIdList = testContext.getResponse().get("data")
        List<Map> categoryIds =categoryIdList.stream().map { x -> return x."id" }.collect(Collectors.toList())
        return categoryIds
    }


}
