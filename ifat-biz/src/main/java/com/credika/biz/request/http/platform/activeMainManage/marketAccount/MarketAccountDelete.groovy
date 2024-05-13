package com.credika.biz.request.http.platform.activeMainManage.marketAccount


import com.miyuan.ifat.support.test.TestContext

class MarketAccountDelete extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "MarketCount/delete"
       super.params = ["id"]
    }

    MarketAccountDelete invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MarketAccountDelete specialAssert(TestContext testContext){
        String is_delete = com.credika.biz.service.MysqlService.marketAccountIsDelete()
        assert is_delete  == "1"
        return this
    }

    MarketAccountDelete baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
