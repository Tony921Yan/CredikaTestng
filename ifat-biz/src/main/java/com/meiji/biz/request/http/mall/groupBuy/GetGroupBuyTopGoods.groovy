package com.meiji.biz.request.http.mall.groupBuy

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class GetGroupBuyTopGoods extends MallPost{
    {
        super.api = "groupBuy/getGroupBuyTopGoods"
        super.params = [ ]
    }

    GetGroupBuyTopGoods afterinvoke(TestContext testContext){
       def apiResult = testContext.getResponse().data
        if(apiResult==null){
            println("无拼团商品")
            throw new SkipException("无拼团商品")
        }
       testContext.put("beginTime",apiResult.beginTime)
       testContext.put("activityId",apiResult.activeMainId)
       testContext.put("spuId",apiResult.goodsList.getAt(0).getAt("spuId"))
        return this
    }

    GetGroupBuyTopGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupBuyTopGoods baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
