package com.credika.biz.request.http.mall.userShop

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/16-10:48
 */
class GetConfigValue extends MallPost{
    {
        super.api = "userShop/getConfigValue"
        super.params=["key"]
    }

    GetConfigValue invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetConfigValue baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
