package com.miyuan.api

import com.jd.open.api.sdk.JdClient
import com.miyuan.factory.FactorySupport
import jd.union.open.goods.query.request.UnionOpenGoodsQueryRequest
import jd.union.open.goods.query.response.UnionOpenGoodsQueryResponse
import jd.union.open.promotion.bysubunionid.get.request.UnionOpenPromotionBysubunionidGetRequest
import jd.union.open.promotion.bysubunionid.get.response.UnionOpenPromotionBysubunionidGetResponse
import jd.union.open.promotion.byunionid.get.request.UnionOpenPromotionByunionidGetRequest
import jd.union.open.promotion.byunionid.get.response.UnionOpenPromotionByunionidGetResponse
import jd.union.open.promotion.common.get.request.UnionOpenPromotionCommonGetRequest
import jd.union.open.promotion.common.get.response.UnionOpenPromotionCommonGetResponse

class JdAPI {
    @Lazy
    static JdClient jdClient= FactorySupport.createJdClient("jd")

    static UnionOpenGoodsQueryResponse unionOpenGoodsQuery(UnionOpenGoodsQueryRequest req){
        return jdClient.execute(req);
    }

    /*
    网站/APP获取推广链接接口 jd.union.open.promotion.common.get
     */
    static UnionOpenPromotionCommonGetResponse unionOpenPromotionCommonGet(UnionOpenPromotionCommonGetRequest req){
        return jdClient.execute(req);
    }

    /*
    社交媒体获取推广链接接口【申请】 jd.union.open.promotion.bysubunionid.get
    */
    static UnionOpenPromotionBysubunionidGetResponse unionOpenPromotionBysubunionidGet(UnionOpenPromotionBysubunionidGetRequest  req){
        return jdClient.execute(req);
    }

    /*
    工具商获取推广链接接口【申请】 jd.union.open.promotion.byunionid.get
    */
    static UnionOpenPromotionByunionidGetResponse  unionOpenPromotionByunionidGet(UnionOpenPromotionByunionidGetRequest  req){
        return jdClient.execute(req);
    }
}
