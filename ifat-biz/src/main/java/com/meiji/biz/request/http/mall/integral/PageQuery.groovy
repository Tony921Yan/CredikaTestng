package com.meiji.biz.request.http.mall.integral
import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class PageQuery extends MallPost {
    {
        super.api = "integral/pageQuery"
        super.params = ["page", "rows", "userId", "condition", "dateType"]
    }

    PageQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageQuery baseAssert(TestContext testContext) {
        super.baseAssert(testContext)
        return this
    }

    PageQuery specialAssert(TestContext testContext) {
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.pageQuery(testContext.get("userId")).get(0)
        System.out.println("apiResult" + apiResult)
        System.out.println("mysqlResult" + mysqlResult)
        assert apiResult.total > 20
        assert mysqlResult.change_type == apiResult.dataList.getAt(0).getAt("changeType")
        assert mysqlResult.task_name == apiResult.dataList.getAt(0).getAt("taskName")
        assert mysqlResult.change_integral == apiResult.dataList.getAt(0).getAt("changeIntegral")
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.dataList.getAt(0).getAt("gmtCreate"))
        return this
    }
}