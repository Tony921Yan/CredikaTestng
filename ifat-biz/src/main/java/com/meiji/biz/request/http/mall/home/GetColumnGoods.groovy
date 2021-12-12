package com.meiji.biz.request.http.mall.home

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/18-21:48
 @version v2.1
 */
class GetColumnGoods extends MallPost{
    {
        super.api = "home/getColumnGoods"
        super.params=["shopId","columnId"]
    }

    GetColumnGoods invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetColumnGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
