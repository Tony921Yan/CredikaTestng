package com.meiji.biz.request.http.platform.aftersalesDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CheckGoods extends PlatformPost {
    {
        super.api = "AftersalesDetailManage/checkGoods"
        super.params =  [ "orderAfterCode","logisticsCode","logisticsCompanyName"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    CheckGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CheckGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CheckGoods baseAssert(TestContext testContext){
        assert testContext.getResponse().msg == '只能操作待收货验货状态的售后单(00005)'
        assert testContext.getResponse().code == 10
        return this
    }

}
