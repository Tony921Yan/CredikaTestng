package com.meiji.biz.request.http.mall.active

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/04/20 9:24
 * @Vession v2.7.1
 * */
class GetSeckillTopGoods extends MallPost{
    {
        super.api = "active/getSeckillTopGoods"
        super.params = []
    }

    GetSeckillTopGoods invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetSeckillTopGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
