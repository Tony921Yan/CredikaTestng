package com.meiji.biz.request.http.platform.stockManger
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
class QueryActivitiesByType extends PlatformPost{
    {
        super.api="StockManage/queryActivitiesByType"
        super.params = ["type","page","rows"]
    }

    QueryActivitiesByType invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QueryActivitiesByType preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QueryActivitiesByType baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
