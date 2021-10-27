package com.meiji.biz.request.http.mall.userAddress

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class AddUserAddress extends MallPost {
    {
        super.api = "/userAddress/addUserAddress"
        super.params =  ["address","city","cityCode","district","districtCode","isDefault","phone","province","provinceCode",
                         "recipient","remark"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    AddUserAddress invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddUserAddress preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddUserAddress baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
