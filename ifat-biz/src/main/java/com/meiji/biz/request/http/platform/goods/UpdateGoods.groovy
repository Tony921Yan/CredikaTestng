package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateGoods extends PlatformPost{
    {
        super.api = "GoodsDetailManage/updateGoods"
        super.params = ["backgroundCategoryId",
        "brandId",
        "buyerShowLabelList",
        "carouselPic",
        "deliveryType",
        "detail",
        "freAskedQuestions",
        "freightTemplateId",
        "frontDeskCategoryId",
        "goodsCardPic",
        "goodsType",
        "goodsVideo",
        "id",
        "insurance",
        "isCompensation",
        "isPurchaseLimits",
        "isSevenDayReturn",
        "isShowSupSuggest",
        "labelIds",
        "limitCycle",
        "limitNum",
        "manyProperty",
        "name",
        "originAddress",
        "pics",
        "sellingPoint",
        "skus",
        "supervisorId",
        "supplierCode",
        "supplierId",
        "supplierReturnAddressId"]

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
