package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class FindOfficeShopModuleList extends MallPost {
    {
        super.api = "/shopGoods/findOfficeShopModuleList"
        super.params =  []
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindOfficeShopModuleList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindOfficeShopModuleList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindOfficeShopModuleList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindOfficeShopModuleList specialAssert(TestContext testContext){
        return this
    }
}
