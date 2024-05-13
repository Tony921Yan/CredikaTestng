package com.credika.biz.request.http.platform.stockManger


import com.miyuan.ifat.support.test.TestContext

class PageQueryAllotBill extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="StockManage/pageQueryAllotBill"
        super.params = ["pageNum","pageSize"]
    }

    PageQueryAllotBill invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageQueryAllotBill preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageQueryAllotBill baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PageQueryAllotBill specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = com.credika.biz.service.MysqlService.pageQueryAllotBill().get(0)
        assert apiResult.total >10

    }

}
