package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class SubmitGoods extends PlatformPost{
    {
        super.api = "GoodsDetailManage/submitGoods"
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
                                       "supplierReturnAddressId"]
    }

    SubmitGoods invoke(TestContext testContext) {
        MysqlService.submitGoods(testContext.get("id"))
        super.invoke(testContext)
        return this
    }

    SubmitGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SubmitGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
