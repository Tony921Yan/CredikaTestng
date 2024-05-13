package com.credika.biz.request.http.platform.member


import com.miyuan.ifat.support.test.TestContext

class FindUserOrderInfo extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/Memeber/findUserOrderInfo"
        super.params = ["condition","page","rows"]
    }

    FindUserOrderInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUserOrderInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindUserOrderInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    FindUserOrderInfo specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.dataList.getAt(0))
        Map mysqlResult = com.credika.biz.service.MysqlService.findUserOrderInfo()
        System.out.println("mysqlResult"+mysqlResult)
        assert apiResult.total > 10
        assert mysqlResult.order_code == apiResult.dataList.getAt(0).getAt("orderCode")
        assert mysqlResult.shop_id == apiResult.dataList.getAt(0).getAt("shopId")
        assert mysqlResult.actually_paid_amount == apiResult.dataList.getAt(0).getAt("actuallyPaidAmount")
        assert mysqlResult.shop_name == apiResult.dataList.getAt(0).getAt("shopName")
        assert com.credika.biz.util.DateUtil.strToDate(mysqlResult.gmt_create as String) == com.credika.biz.util.DateUtil.strToDate(apiResult.dataList.getAt(0).getAt("gmtCreate"))
    }

}
