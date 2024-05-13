package com.credika.biz.request.http.mall.live

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy* @date 2022/01/27 18:34
 * @Vession V2.1
 */
class LiveLike extends MallPost{
    {
        super.api = "live/liveLike"
        super.params = ["roomId"]
    }

    LiveLike invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    LiveLike baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
