package com.credika.biz.request.http.mall.orderExhibit

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy* @date 2022/01/06 22:05
 * @Vession V2.4
 */
class DeleteBuyerShow extends MallPost{
    {
        super.api = "orderExhibit/deleteBuyerShow"
        super.params = ["id"]
        super.preInvoke = "PublishWithoutOrder"
    }

    DeleteBuyerShow invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    DeleteBuyerShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
