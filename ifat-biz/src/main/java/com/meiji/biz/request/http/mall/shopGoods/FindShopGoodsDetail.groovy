package com.meiji.biz.request.http.mall.shopGoods

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.EsService
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class FindShopGoodsDetail extends MallPost {
    {
        super.api = "/shopGoods/findShopGoodsDetail"
        super.params =  [ "shopId","spuId","type","raffleRecordId"]
    }

    FindShopGoodsDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindShopGoodsDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindShopGoodsDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindShopGoodsDetail specialAssert(TestContext testContext){
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
        return this
    }

    FindShopGoodsDetail specialAssert1(TestContext testContext){
        //shipperAddress断言：数据库断言时，先通过接口返回的supplierName查表对应的ID，再通过ID查表对应的默认地址中的shipperAddress
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.getGoods_spu(testContext.get("spuId"))
        Integer supplierID = MysqlService.getSupplierId(apiResult.get("supplierName"))
        Map mysqlShipperAddress = MysqlService.getShipperAddress(supplierID)
        assert apiResult.get("goodsSpeParameters") == mysqlResult.get("goods_spe_parameters")
        assert apiResult.get("shipperAddress")  == mysqlShipperAddress.get("shipper_address")
        assert apiResult.get("defaultLogistics") == mysqlResult.get("default_logistics")
        assert apiResult.get("deliveryTime")== mysqlResult.get("delivery_time")
    }
}
