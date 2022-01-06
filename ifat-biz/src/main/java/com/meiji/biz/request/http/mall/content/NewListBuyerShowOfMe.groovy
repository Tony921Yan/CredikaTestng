package com.meiji.biz.request.http.mall.content

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/16 22:32
 @version v2.3
 */
class NewListBuyerShowOfMe extends MallPost {
    {
        super.api = "orderExhibit/newListBuyerShowOfMe"
        super.params =  ["userId","rows","page"]
    }

    NewListBuyerShowOfMe invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    NewListBuyerShowOfMe preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    NewListBuyerShowOfMe baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
