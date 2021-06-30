package com.meiji.biz.request.http.mall

import com.miyuan.ifat.support.test.TestContext

class AddUserAddress extends MallPost {
    {
        super.api = "/mall/user/address/addUserAddress"
        super.params =  ["address","city","cityCode","district","districtCode","isDefault","phone","province","provinceCode",
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
