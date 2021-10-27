package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindShopCustomerGroupByShopId extends MallPost {
    {
        super.api = "shopGroup/findShopCustomerGroupByShopId"
        super.params =  ["id"]
    }

    FindShopCustomerGroupByShopId invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopCustomerGroupByShopId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
