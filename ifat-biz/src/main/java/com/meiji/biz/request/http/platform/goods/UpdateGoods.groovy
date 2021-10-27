package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateGoods extends PlatformPost{
    {
        super.api = "/platform/goodsMgr/updateGoods"
        super.params = ["id","name","sellingPoint","originAddress","brandId","frontDeskCategoryId","backgroundCategoryId","detail",
        "manyProperty","createBy","createByName","updateBy","updateByName","supplierId","supplierCode","deliveryType","isParcel",
        "isSevenDayReturn","freAskedQuestions","supervisorId","isShowSupSuggest","limitCycle","limitNum","isPurchaseLimits",
        "pics","skus"]
    }

    UpdateGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
