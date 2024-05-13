package com.credika.biz.request.http.mall.orderInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.credika.biz.service.MysqlService
import com.credika.biz.util.DateUtil


class PlaceOrder extends MallPost {
    {
        super.api = "/orderInfo/placeOrder"
        super.params =  ["actuallyPaidAmount","freight","goodsTotalAmount","orderGoods","payableAmount","receiverRemark",
        "shopId","userAddressId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    PlaceOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlaceOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlaceOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PlaceOrder specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.getBrand(testContext.get("id"))
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.name == apiResult.name
        assert mysqlResult.icon == apiResult.icon
        assert mysqlResult.remark == apiResult.remark
        assert mysqlResult.create_by == apiResult.createBy
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.gmtCreate)
        assert  DateUtil.strToDate(mysqlResult.gmt_modified as String) ==  DateUtil.strToDate(apiResult.gmtModified)
        return this
    }
}
