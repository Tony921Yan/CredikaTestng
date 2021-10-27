package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class PageOrder extends MallPost {
    {
        super.api = "/orderInfo/pageOrder"
        super.params =  ["limit","queryStr","page","shopId","status"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    PageOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    PageOrder specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.pageOrder(testContext.get("shopId")).get(0)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.id == apiResult.orderList[0].getAt("id")
        assert mysqlResult.order_code == apiResult.orderList[0].getAt("orderCode")
        assert mysqlResult.shop_id == apiResult.orderList[0].getAt("shopId")
        assert mysqlResult.shop_name == apiResult.orderList[0].getAt("shopName")
        assert DateUtil.strToDate(mysqlResult.gmt_create as String ) == DateUtil.strToDate(apiResult.orderList[0].getAt("gmtCreate"))
        assert mysqlResult.order_type == apiResult.orderList[0].getAt("orderType")
        assert mysqlResult.kj_order_status == apiResult.orderList[0].getAt("kjOrderStatus")
        assert mysqlResult.order_status == apiResult.orderList[0].getAt("orderStatus")
        assert mysqlResult.freight == apiResult.orderList[0].getAt("freight")
        assert mysqlResult.goods_total_amount == apiResult.orderList[0].getAt("goodsTotalAmount")
        assert mysqlResult.actually_paid_amount == apiResult.orderList[0].getAt("actuallyPaidAmount")
        assert mysqlResult.supplier_id == apiResult.orderList[0].getAt("supplierId")
        assert mysqlResult.buyer_id == apiResult.orderList[0].getAt("buyerId")
        assert mysqlResult.supplier_name == apiResult.orderList[0].getAt("supplierName")
        return this
    }
}
