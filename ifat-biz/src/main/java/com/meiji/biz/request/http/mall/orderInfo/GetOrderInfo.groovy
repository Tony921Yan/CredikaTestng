package com.meiji.biz.request.http.mall.orderInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class GetOrderInfo extends MallPost {
    {
        super.api = "/orderInfo/getOrderInfo"
        super.params =  ["orderCode"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    GetOrderInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOrderInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOrderInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    MallPost specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.order_info(testContext.get("orderCode")).get(0)
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.id == apiResult.id
        assert mysqlResult.order_code == apiResult.orderCode
        assert mysqlResult.shop_id == apiResult.shopId
        assert mysqlResult.shop_name == apiResult.shopName
        assert mysqlResult.shop_user_id as String == apiResult.shopUserId
        assert mysqlResult.shop_user_name == apiResult.shopUserName
        assert mysqlResult.shop_remark == apiResult.shopRemark
        assert mysqlResult.order_status == apiResult.orderStatus
        assert mysqlResult.payable_amount == apiResult.goodsTotalAmount
        assert mysqlResult.actually_paid_amount == apiResult.actuallyPaidAmount
        assert mysqlResult.receiver_name == apiResult.receiverName
        assert mysqlResult.receiver_address == apiResult.receiverAddress
        assert mysqlResult.receiver_nick == apiResult.receiverNick
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.gmtCreate)
        assert DateUtil.strToDate(mysqlResult.order_complete_time as String) == DateUtil.strToDate(apiResult.orderCompleteTime)
        assert mysqlResult.order_type == apiResult.orderType
        assert mysqlResult.kj_order_status == apiResult.kjOrderStatus
        assert mysqlResult.supplier_id == apiResult.supplierId
        assert mysqlResult.buyer_id == apiResult.buyerId
        assert mysqlResult.platform_remark == apiResult.platformRemark
        assert mysqlResult.supplier_name == apiResult.supplierName
    }
}
