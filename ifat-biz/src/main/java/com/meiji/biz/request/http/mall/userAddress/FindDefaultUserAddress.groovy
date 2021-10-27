package com.meiji.biz.request.http.mall.userAddress

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class FindDefaultUserAddress extends MallPost {
    {
        super.api = "/userAddress/findDefaultUserAddress"
        super.params =  ["userId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindDefaultUserAddress invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindDefaultUserAddress preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindDefaultUserAddress baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    FindDefaultUserAddress specialAssert(TestContext testContext){
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
