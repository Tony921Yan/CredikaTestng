package com.meiji.biz.request.http.mall.live

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/01/27 18:13
 * @Vession V2.1
 */
class GetLiveSetting extends MallPost{
    {
        super.api = "live/getLiveSetting"
        super.params =[]
    }

    GetLiveSetting invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetLiveSetting baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
