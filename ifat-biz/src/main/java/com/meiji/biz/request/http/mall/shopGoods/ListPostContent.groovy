package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/18-10:48
 @version v2.1
 */
class ListPostContent extends MallPost{
    {
        super.api = "shopGoods/listPostContent"
        super.params=["spuId"]
    }

    ListPostContent invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    ListPostContent baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
