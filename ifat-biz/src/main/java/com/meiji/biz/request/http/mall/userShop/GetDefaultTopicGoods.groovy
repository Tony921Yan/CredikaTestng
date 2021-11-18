package com.meiji.biz.request.http.mall.userShop

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author Remy
 @create 2021/11/16-10:48
 @version v2.1
 */
class GetDefaultTopicGoods extends MallPost{
    {
        super.api = "home/getDefaultTopicGoods"
        super.params=["page","rows","shopId","topicIds"]
    }

    GetDefaultTopicGoods invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetDefaultTopicGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
