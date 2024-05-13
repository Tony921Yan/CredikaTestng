package com.credika.biz.request.http.mall.userShop

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class FindUserVisitShopRecordList extends MallPost {
    {
        super.api = "/userShop/findUserVisitShopRecordList"
        super.params =  ["page","rows"]
    }

    FindUserVisitShopRecordList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUserVisitShopRecordList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindUserVisitShopRecordList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
