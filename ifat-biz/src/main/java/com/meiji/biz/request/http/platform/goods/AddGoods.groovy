package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/3/6-17:50
 @update 2021/11/25-17:50
 @version v2.2
 */
class AddGoods extends PlatformPost{
    {
        super.api = "GoodsDetailManage/addSubmitGoods"
        super.params = ["carouselPic",
                        "freightTemplateId",
                        "goodsType",
                        "goodsVideo",
                        "insurance",
                        "supplierReturnAddressId",
                        "name",
                        "sellingPoint",
                        "originAddress",
                        "brandId",
                        "frontDeskCategoryId",
                        "backgroundCategoryId",
                        "detail",
                        "manyProperty",
                        "createBy",
                        "createByName",
                        "updateBy",
                        "updateByName",
                        "supplierId",
                        "supplierCode",
                        "deliveryType",
                        "isSevenDayReturn",
                        "freAskedQuestions",
                        "supervisorId",
                        "isShowSupSuggest",
                        "limitCycle",
                        "limitNum",
                        "isPurchaseLimits",
                        "labelIds",
                        "goodsCardPic",
                        "pics",
                        "skus",]
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
