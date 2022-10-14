package com.meiji.biz.request.http.platform.stockManger
import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class PageQueryAllotBill extends PlatformPost{
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
        Map mysqlResult = MysqlService.pageQueryAllotBill().get(0)
        assert apiResult.total >10

    }

}
