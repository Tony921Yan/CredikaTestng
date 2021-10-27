package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddSubmitGoods extends PlatformPost{
    {
        super.api = "/platform/goodsMgr/addSubmitGoods"
        super.params = ["name","sellingPoint","originAddress","brandId","frontDeskCategoryId","backgroundCategoryId","detail",
        "manyProperty","createBy","createByName","updateBy","updateByName","supplierId","supplierCode","deliveryType","isParcel",
        "isSevenDayReturn","freAskedQuestions","supervisorId","isShowSupSuggest","limitCycle","limitNum","isPurchaseLimits",
        "pics","skus"]
    }

    AddSubmitGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddSubmitGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddSubmitGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
