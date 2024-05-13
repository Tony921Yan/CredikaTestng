package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/3/6-17:50
 @update 2021/11/25-17:50,2022/3/14-23:50
 @version v2.2
 */
class AddGoods extends PlatformPost{
    {
        super.api = "GoodsDetailManage/addGoods"
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
        "supplierReturnAddressId",
        "isOnlyGift"]
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
