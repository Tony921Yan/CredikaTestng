package com.credika.biz.request.http.mall.orderExhibit

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class NewListBuyerShowToShare extends MallPost {
    {
        super.api = "orderExhibit/newListBuyerShowToShare"
        super.params =  ["condition","rows","page"]
    }

    NewListBuyerShowToShare invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    NewListBuyerShowToShare preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    NewListBuyerShowToShare baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
