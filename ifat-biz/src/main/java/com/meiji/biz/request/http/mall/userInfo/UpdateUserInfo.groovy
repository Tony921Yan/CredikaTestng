package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.util.JsonUtil
import org.apache.commons.lang3.ObjectUtils


class UpdateUserInfo extends MallPost {
    {
        super.api = "/userInfo/updateUserInfo"
        super.params =  ["avatar","nickname","sex"]
//        super.preInvoke = "com.meiji.biz.request.http.mall.userInfo.FindUserInfo"
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
