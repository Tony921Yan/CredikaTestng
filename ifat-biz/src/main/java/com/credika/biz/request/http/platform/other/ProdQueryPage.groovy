package com.credika.biz.request.http.platform.other


import com.miyuan.ifat.support.test.TestContext

class ProdQueryPage extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/ElectronicContract/queryPage"
        super.params =  [ "condition","page","rows"]
    }

    ProdQueryPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ProdQueryPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ProdQueryPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    ProdQueryPage specialAssert(TestContext testContext){
        Map mysqlDate = com.credika.biz.service.MysqlService.prodQueryPage(testContext.get("rows"))get(0)
        Map apiDate = testContext.getResponse().data
        System.out.print("apiDate:" + apiDate)
        assert mysqlDate.contTotal == apiDate.total
        return this
    }
}
