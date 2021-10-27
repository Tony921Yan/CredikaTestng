package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class CustomerList extends MallPost {
    {
        super.api = "/Customer/customerList"
        super.params =  [ "shopId","sort","sortType","gmtCreateEnd","gmtCreateStart","gmtLastVisitEnd",
        "gmtLastVisitStart","page","rows"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    CustomerList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CustomerList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CustomerList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    CustomerList specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }
}
