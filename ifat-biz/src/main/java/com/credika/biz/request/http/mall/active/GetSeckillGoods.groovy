package com.credika.biz.request.http.mall.active

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/04/20 9:24
 * @Vession v2.7.1
 * */
class GetSeckillGoods extends MallPost{
    {
        super.api = "active/getSeckillGoods"
        super.params = ["activeMainId","sessionCode","subTimeId","page","rows"]
    }

    GetSeckillGoods invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetSeckillGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
