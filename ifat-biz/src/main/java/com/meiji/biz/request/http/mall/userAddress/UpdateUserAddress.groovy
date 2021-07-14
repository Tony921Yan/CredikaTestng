package com.meiji.biz.request.http.mall.userAddress

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class UpdateUserAddress extends MallPost {
    {
        super.api = "/userAddress/updateUserAddress"
        super.params =  ["address","city","cityCode","district","districtCode","id","isDefault","phone","province","provinceCode",
                         "recipient","remark"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
