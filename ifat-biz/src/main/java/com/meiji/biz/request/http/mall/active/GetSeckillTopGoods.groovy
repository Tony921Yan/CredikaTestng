package com.meiji.biz.request.http.mall.active

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

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

    GetSeckillTopGoods afterinvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data
        if(apiResult.goodsList.size()==0){
            throw new SkipException("无秒杀商品")
        }
        testContext.put("subTimeId",apiResult.subTimeId)
        testContext.put("activeMainId",apiResult.activeMainId)
        testContext.put("beginTime",apiResult.beginTime)
        testContext.put("spuId",apiResult.goodsList.getAt(0).getAt("spuId"))
        return this
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
