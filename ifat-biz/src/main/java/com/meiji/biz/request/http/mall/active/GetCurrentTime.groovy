package com.meiji.biz.request.http.mall.active

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/04/21 9:24
 * @Vession v2.7.1
 * */
class GetCurrentTime extends MallPost{
    {
        super.api = "active/getCurrentTime"
        super.params = []
    }

    GetCurrentTime invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetCurrentTime baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
