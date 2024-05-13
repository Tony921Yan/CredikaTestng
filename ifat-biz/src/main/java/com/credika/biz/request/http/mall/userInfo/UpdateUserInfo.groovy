package com.credika.biz.request.http.mall.userInfo

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.credika.biz.service.MysqlService

class UpdateUserInfo extends MallPost {
    {
        super.api = "/userInfo/updateUserInfo"
        super.params =  ["avatar","nickname","sex"]
//        super.preInvoke = "FindUserInfo"
    }

    UpdateUserInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateUserInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateUserInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    UpdateUserInfo specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.getUserInfo(testContext.get("userId"))
        assert mysqlResult.nickname == testContext.nickname
        assert mysqlResult.avatar == testContext.avatar
        assert String.valueOf(mysqlResult.sex) == String.valueOf(testContext.sex)
        return this
    }
}
