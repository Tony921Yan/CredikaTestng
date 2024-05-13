package com.credika.biz.request.http.platform.brand

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.credika.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class BrandDetail extends PlatformPost {
    {
        super.api = "/BrandManage/brandDetail"
        super.params =  [ "id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    BrandDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    BrandDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    BrandDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    BrandDetail specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.getBrand(testContext.get("id"))
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.name == apiResult.name
        assert mysqlResult.icon == apiResult.icon
        assert mysqlResult.remark == apiResult.remark
        assert mysqlResult.create_by == apiResult.createBy
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.gmtCreate)
        return this
//        assert DateUtil.strToDate(mysqlResult.gmt_modified as String) ==  DateUtil.strToDate(apiResult.gmtModified)
        return this
    }
}
