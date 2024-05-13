package com.credika.biz.request.http.mall.orderExhibit

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/16 22:32
 @version v2.3
 */
class LogBuyerShowTrace extends MallPost {
    {
        super.api = "orderExhibit/logBuyerShowTrace"
        super.params =  ["avatar","id","nickname","traceType","userId"]
    }

    LogBuyerShowTrace invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    LogBuyerShowTrace preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    LogBuyerShowTrace baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
