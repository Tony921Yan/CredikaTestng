package com.miyuan.debug

import com.miyuan.api.JdAPI
import jd.union.open.goods.query.request.GoodsReq
import jd.union.open.goods.query.request.UnionOpenGoodsQueryRequest
import jd.union.open.goods.query.response.UnionOpenGoodsQueryResponse
import jd.union.open.promotion.bysubunionid.get.request.UnionOpenPromotionBysubunionidGetRequest
import jd.union.open.promotion.bysubunionid.get.response.UnionOpenPromotionBysubunionidGetResponse
import jd.union.open.promotion.byunionid.get.request.UnionOpenPromotionByunionidGetRequest
import jd.union.open.promotion.byunionid.get.response.UnionOpenPromotionByunionidGetResponse
import jd.union.open.promotion.common.get.request.PromotionCodeReq
import jd.union.open.promotion.common.get.request.UnionOpenPromotionCommonGetRequest
import jd.union.open.promotion.common.get.response.UnionOpenPromotionCommonGetResponse
import org.testng.annotations.Test

class JdDebug {
    @Test
    void test(){
        UnionOpenGoodsQueryRequest req = new UnionOpenGoodsQueryRequest()
        GoodsReq goodsReq = new GoodsReq()
        goodsReq.setPageSize(10)
        goodsReq.setPageIndex(1)
        goodsReq.setIsCoupon(1);
        goodsReq.setIsHot(1);
        goodsReq.setIsPG(0);
        req.setGoodsReqDTO(goodsReq)
        UnionOpenGoodsQueryResponse response = JdAPI.unionOpenGoodsQuery(req)
        println(response.data)
    }

    @Test
    void test2(){
        UnionOpenPromotionCommonGetRequest unionOpenPromotionCommonGetRequest = new UnionOpenPromotionCommonGetRequest()
//        PromotionCodeReq promotionCodeReq1 = new PromotionCodeReq()
//        promotionCodeReq1.setMaterialId("https://item.jd.com/29250641488.html")
//        promotionCodeReq1.setSiteId("1821425471")
//        unionOpenPromotionCommonGetRequest.setPromotionCodeReq(promotionCodeReq1)
//        UnionOpenPromotionCommonGetResponse unionOpenPromotionCommonGetResponse = JdAPI.unionOpenPromotionCommonGet(unionOpenPromotionCommonGetRequest)
//        println(unionOpenPromotionCommonGetResponse.data.clickURL)
        UnionOpenPromotionBysubunionidGetRequest unionOpenPromotionBysubunionidGetRequest = new UnionOpenPromotionBysubunionidGetRequest()
        jd.union.open.promotion.bysubunionid.get.request.PromotionCodeReq promotionCodeReq2 = new jd.union.open.promotion.bysubunionid.get.request.PromotionCodeReq()
        promotionCodeReq2.setMaterialId("https://u.jd.com/t7Lavrt")
        unionOpenPromotionBysubunionidGetRequest.setPromotionCodeReq(promotionCodeReq2)
        UnionOpenPromotionBysubunionidGetResponse unionOpenPromotionBysubunionidGetResponse = JdAPI.unionOpenPromotionBysubunionidGet(unionOpenPromotionBysubunionidGetRequest)
        println(unionOpenPromotionBysubunionidGetResponse.data.shortURL)
        UnionOpenPromotionByunionidGetRequest unionOpenPromotionByunionidGetRequest = new UnionOpenPromotionByunionidGetRequest()
//        jd.union.open.promotion.byunionid.get.request.PromotionCodeReq promotionCodeReq3 = new jd.union.open.promotion.byunionid.get.request.PromotionCodeReq()
//        promotionCodeReq3.setMaterialId("https://item.jd.com/29250641488.html")
//        promotionCodeReq3.setSubUnionId("zhuanke_700981165")
//        unionOpenPromotionByunionidGetRequest.setPromotionCodeReq(promotionCodeReq3)
//        UnionOpenPromotionByunionidGetResponse unionOpenPromotionByunionidGetResponse = JdAPI.unionOpenPromotionCommonGet(unionOpenPromotionByunionidGetRequest)
//        println(unionOpenPromotionByunionidGetResponse.data.clickURL)
    }
}
