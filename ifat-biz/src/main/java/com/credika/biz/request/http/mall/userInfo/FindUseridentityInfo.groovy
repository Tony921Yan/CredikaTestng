package com.credika.biz.request.http.mall.userInfo

import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class FindUseridentityInfo extends MallPost {
    {
        super.api = "/userInfo/findUseridentityInfo"
        super.params =  ["id"]

    }

    FindUseridentityInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUseridentityInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindUseridentityInfo specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.findUserInfo(testContext.get("id")).get(0)
        println(mysqlResult)
        Map apiResult = testContext.getResponse().data
        assert mysqlResult.is_new == apiResult.isNewUser
        assert mysqlResult.is_wechat_work == apiResult.isUserWechatWork
        assert mysqlResult.is_add_wechat_user == apiResult.isAddWechatUser
        assert mysqlResult.is_new_fans == apiResult.isNewFans
        assert mysqlResult.is_members == apiResult.isMembers
        return this
    }

}
