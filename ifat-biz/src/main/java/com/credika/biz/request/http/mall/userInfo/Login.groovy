package com.credika.biz.request.http.mall.userInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.credika.biz.service.MysqlService
import com.credika.biz.util.DateUtil


class Login extends MallPost {
    {
        super.api = "/userInfo/login/applet"
        super.params =  ["code","appId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    Login invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Login preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Login baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    Login specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.getBrand(testContext.get("id"))
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.name == apiResult.name
        assert mysqlResult.icon == apiResult.icon
        assert mysqlResult.remark == apiResult.remark
        assert mysqlResult.create_by == apiResult.createBy
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.gmtCreate)
        assert  DateUtil.strToDate(mysqlResult.gmt_modified as String) ==  DateUtil.strToDate(apiResult.gmtModified)
        return this
    }
}
