package com.credika.biz.request.http.platform.brand

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.credika.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class QueryBrandsByPage extends PlatformPost{
    {
        super.api = "BrandManage/queryPage"
        super.params = ["pageNum","pageSize"]
    }

    QueryBrandsByPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QueryBrandsByPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    QueryBrandsByPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.getGoods_brand()
        assert mysqlResult.name == apiResult.dataList.getAt(0).getAt("name")
        assert mysqlResult.id == apiResult.dataList.getAt(0).getAt("id")
        assert mysqlResult.remark == apiResult.dataList.getAt(0).getAt("remark")
        assert mysqlResult.icon == apiResult.dataList.getAt(0).getAt("icon")
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.dataList.getAt(0).getAt("gmtCreate"))
        assert DateUtil.strToDate(mysqlResult.gmt_modified as String) == DateUtil.strToDate(apiResult.dataList.getAt(0).getAt("gmtModified"))
        assert apiResult.total > 20
        return this
    }
}
