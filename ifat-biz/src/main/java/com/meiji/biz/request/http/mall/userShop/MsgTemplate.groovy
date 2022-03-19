package com.meiji.biz.request.http.mall.userShop

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/03/18 12:01
 * @Vession v2.6.3
 * */
class MsgTemplate extends MallPost{
    {
        super.api = "userShop/msgTemplate"
        super.params = ["list"]
    }

    MsgTemplate invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    MsgTemplate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
