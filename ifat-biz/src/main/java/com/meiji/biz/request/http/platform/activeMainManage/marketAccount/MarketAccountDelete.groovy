package com.meiji.biz.request.http.platform.activeMainManage.marketAccount

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class MarketAccountDelete extends PlatformPost{
    {
        super.api = "MarketCount/delete"
       super.params = ["id"]
    }

    MarketAccountDelete invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MarketAccountDelete specialAssert(TestContext testContext){
        String is_delete = MysqlService.marketAccountIsDelete()
        assert is_delete  == "1"
        return this
    }

    MarketAccountDelete baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
