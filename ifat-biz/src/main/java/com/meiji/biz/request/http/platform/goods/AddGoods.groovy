package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddGoods extends PlatformPost{
    {
        super.api = "/platform/goodsMgr/addGoods"
        super.params = ["name","sellingPoint","originAddress","brandId","frontDeskCategoryId","backgroundCategoryId","detail",
        "manyProperty","createBy","createByName","updateBy","updateByName","supplierId","supplierCode","deliveryType","isParcel",
        "isSevenDayReturn","freAskedQuestions","supervisorId","isShowSupSuggest","limitCycle","limitNum","isPurchaseLimits",
        "pics","skus"]
    }

    AddGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
