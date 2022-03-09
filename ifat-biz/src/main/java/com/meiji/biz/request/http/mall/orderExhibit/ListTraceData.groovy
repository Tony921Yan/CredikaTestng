package com.meiji.biz.request.http.mall.orderExhibit

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class ListTraceData extends MallPost {
    {
        super.api = "orderExhibit/listTraceData"
        super.params =  ["showIds"]
    }

    ListTraceData invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ListTraceData preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ListTraceData baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
