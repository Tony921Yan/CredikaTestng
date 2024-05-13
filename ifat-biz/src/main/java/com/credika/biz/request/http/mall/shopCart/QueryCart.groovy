package com.credika.biz.request.http.mall.shopCart

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/16-10:48
 @version v2.1
 */
class QueryCart extends MallPost{
    {
        super.api = "ShopCart/queryCart"
        super.params=["shopId","userId"]
    }

    QueryCart invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    QueryCart baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
