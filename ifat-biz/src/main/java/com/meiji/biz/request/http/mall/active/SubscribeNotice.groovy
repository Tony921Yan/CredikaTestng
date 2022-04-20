package com.meiji.biz.request.http.mall.active

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/04/20 9:24
 * @Vession v2.7.1
 * */
class SubscribeNotice extends MallPost{
    {
        super.api = "active/subscribeNotice"
        super.params = ["beginTime","shopId","spuId","subTimeId"]
    }

    SubscribeNotice invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    SubscribeNotice baseAssert(TestContext testContext){
        assert testContext.getResponse().code == 10
        return this
    }
}
