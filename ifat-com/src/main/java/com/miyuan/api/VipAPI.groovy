package com.miyuan.api

import com.miyuan.factory.FactorySupport
import com.vip.adp.api.open.service.UnionGoodsServiceHelper
import com.vip.adp.api.open.service.UnionOrderServiceHelper
import com.vip.adp.api.open.service.UnionUrlServiceHelper
import com.vip.adp.api.open.service.UrlGenResponse

class VipAPI {
    @Lazy
    static UnionUrlServiceHelper.UnionUrlServiceClient unionUrlServiceClient = FactorySupport.createVipUrlClient("vipUrl")
    @Lazy
    static UnionOrderServiceHelper.UnionOrderServiceClient unionOrderServiceClient = FactorySupport.createVipOrderClient("vipOrder")
    @Lazy
    static UnionGoodsServiceHelper.UnionGoodsServiceClient unionGoodsServiceClient = FactorySupport.createVipGoodsClient("vipGoods")

    static UrlGenResponse genByVIPUrl(List<String> urlList, String chanTag){
        return unionUrlServiceClient.genByVIPUrl(urlList,chanTag,UUID.randomUUID().toString())
    }
}
