package com.meiji.biz.request.http.scrm.shop

import com.meiji.biz.request.http.scrm.ScrmPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/9/18-16:25
 */
class ShopDetail extends ScrmPost{
    {
        super.api = "scrm/shop/detail"
        super.params=["id"]
    }

    @Override
    ScrmPost baseAssert(TestContext testContext) {
        assert testContext.getResponse().code == "403"
    }
}
