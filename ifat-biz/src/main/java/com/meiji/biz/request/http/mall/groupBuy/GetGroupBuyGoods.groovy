package com.meiji.biz.request.http.mall.groupBuy

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
import org.testng.SkipException

class GetGroupBuyGoods extends MallPost{
    {
        super.api = "active/getGroupBuyGoods"
       super.params = ["page","rows"]
    }

    GetGroupBuyGoods afterinvoke(TestContext testContext){
        def apiResult = testContext.getResponse().data.data
           if(apiResult.goodsList.size()==0){
            throw new SkipException("无拼团活动")
        }
        testContext.put("activityId",apiResult.activeMainId)
        testContext.put("spuId",apiResult.goodsList.getAt(0).getAt("spuId"))
        return this

    }

    GetGroupBuyGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupBuyGoods baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
