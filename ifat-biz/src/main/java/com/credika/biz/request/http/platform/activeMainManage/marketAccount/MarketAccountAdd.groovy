package com.credika.biz.request.http.platform.activeMainManage.marketAccount


import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.util.JsonUtil

class MarketAccountAdd extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "MarketCount/add"
       super.params = ["accountAmount","accountName","id","operators","remark","systemOperator"]
    }

    MarketAccountAdd invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MarketAccountAdd afterInvoke(TestContext testContext){
        testContext.put("id", com.credika.biz.service.MysqlService.marketAccountDelete())
        return this
    }

    MarketAccountAdd baseAssert(TestContext testContext){
        if (testContext.getResponse().code ==0){
            assert testContext.getResponse().code == 0
        }else{
            assert testContext.getResponse().code == 10
        }
        return this
    }

    MarketAccountAdd specialAssert(TestContext testContext){
        Map apiResult = testContext.getRequest()
        Map mysqlResult = com.credika.biz.service.MysqlService.marketAccountSearch()
        assert apiResult.accountName == mysqlResult.account_name
        assert apiResult.remark == mysqlResult.remark
        assert apiResult.accountAmount == mysqlResult.account_amount as String
        assert apiResult.operators == JsonUtil.strToJson(mysqlResult.operators)
        return this
    }
}
