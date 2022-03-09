package com.meiji.biz.request.http.mall.gift

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class GetToShareCount extends MallPost {
    {
        super.api = "gift/getToShareCount"
        super.params =  ["userId"]
    }

    GetToShareCount invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetToShareCount baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
