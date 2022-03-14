package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.service.MysqlService
/**
 * @author Remy*
 * @date 2022/03/11 10:00
 * @Vession update from history version
 */
class QueryPage extends PlatformPost{
    {
        super.api = "BrandManage/queryPage"
        super.params = ["pageNum","pageSize"]
    }

    QueryPage invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    QueryPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    QueryPage specialAssert(TestContext testContext){
        Map apiReSult = testContext.getResponse().data
        Map mysqlResult = MysqlService.brandQueryPage()
//        Map mysqlResult1 = MysqlService.brandQueryPage1()
        assert apiReSult.get("total") == mysqlResult.get("total")
        return this
    }
}
