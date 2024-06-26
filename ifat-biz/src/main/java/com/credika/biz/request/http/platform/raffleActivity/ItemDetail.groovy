package com.credika.biz.request.http.platform.raffleActivity


import com.miyuan.ifat.support.test.TestContext

class ItemDetail extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="LuckyManage/itemDetail"
        super.params = ["id"]
    }

    ItemDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ItemDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ItemDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    ItemDetail specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult)
        Map mysqlResult = com.credika.biz.service.MysqlService.itemDetail(testContext.get("id")).get(0)
        System.out.println("mysqlResult"+mysqlResult)
        assert mysqlResult.item_type == apiResult.itemType
        assert mysqlResult.raffled_rate == apiResult.raffledRate
        assert mysqlResult.rec_sort == apiResult.recSort
        assert mysqlResult.item_icon == apiResult.itemIcon
        return this
}
}