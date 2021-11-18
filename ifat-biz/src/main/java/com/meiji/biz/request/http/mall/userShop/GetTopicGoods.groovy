package com.meiji.biz.request.http.mall.userShop

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/18-10:48
 @version v2.1
 */
class GetTopicGoods extends MallPost{
    {
        super.api = "home/getTopicGoods"
        super.params=["page","rows","priceSort","publishTimeSort","salesSort","comprehensiveSort","shopId","topicId"]
    }

    GetTopicGoods invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetTopicGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
