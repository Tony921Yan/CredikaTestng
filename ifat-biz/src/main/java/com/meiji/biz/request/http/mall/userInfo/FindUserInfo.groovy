package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class FindUserInfo extends MallPost {
    {
        super.api = "/userInfo/findUserInfo"
        super.params =  ["id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MallPost specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.findUserInfo(testContext.get("id")).get(0)
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.id == apiResult.id
        assert mysqlResult.phone == apiResult.phone
        assert mysqlResult.nickname == apiResult.nickname
        assert mysqlResult.avatar == apiResult.avatar
        assert mysqlResult.sex == apiResult.sex
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.gmtCreate)
    }
}
