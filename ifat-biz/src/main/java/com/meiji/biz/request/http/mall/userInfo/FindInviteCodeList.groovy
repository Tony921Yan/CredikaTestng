package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.request.http.shop.ShopPost
import com.miyuan.ifat.support.test.TestContext

class FindInviteCodeList extends MallPost {
    {
        super.api = "/inviteCode/findInviteCodeList"
        super.params =  [ "shopId","page","rows","state"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindInviteCodeList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindInviteCodeList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindInviteCodeList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindInviteCodeList specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }
}
