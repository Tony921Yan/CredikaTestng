package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.EsService
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class FindShopGoodsDetail extends MallPost {
    {
        super.api = "/shopGoods/findShopGoodsDetail"
        super.params =  [ "shopId","spuId"]
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MallPost specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
//        System.out.println("apiResult:" + apiResult)
        List<Map> esResult = EsService.findShopGoodsDetailByES(testContext.get("spuId"))
//        System.out.println("esResult: "+ esResult)
        assert apiResult.spuId == esResult.get(0).spuId
        assert apiResult.name == esResult.get(0).spuName
        assert apiResult.sellingPoint == esResult.get(0).sellingPoint
        assert apiResult.isSevenDayReturn == esResult.get(0).isSevenDayReturn
        assert apiResult.goodsBrandName == esResult.get(0).brandName
        assert apiResult.goodsStatus == esResult.get(0).spuStatus
        assert apiResult.goodsType == esResult.get(0).goodsType
        assert apiResult.groupType == esResult.get(0).groupType
        if (apiResult.goodsSpuActiveInfo == null){
            apiResult.goodsSpuActiveInfo =0
            assert apiResult.goodsSpuActiveInfo == esResult.get(0).isActiveGoods}else{
            assert apiResult.goodsSpuActiveInfo == esResult.get(0).isActiveGoods
        }




    }
}
