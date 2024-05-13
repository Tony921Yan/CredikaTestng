package com.credika.biz.request.http.platform.member


import com.miyuan.ifat.support.test.TestContext

class FindUserInfo extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api="/Memeber/findUserInfo"
        super.params = ["id"]
    }

    FindUserInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUserInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindUserInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FindUserInfo specialAssert(TestContext testContext) {
        Map apiResult = testContext.getResponse().data
        List mysqlResult = com.credika.biz.service.MysqlService.findUserInfo(testContext.get("id"))
        assert mysqlResult.get(0).get("phone") == apiResult.phone
        assert mysqlResult.get(0).get("avatar") == apiResult.avatar
        assert mysqlResult.get(0).get("birthday") == apiResult.birthday
        assert com.credika.biz.util.DateUtil.strToDate(mysqlResult.get(0).get("gmt_create") as String) == com.credika.biz.util.DateUtil.strToDate(apiResult.gmtCreate)
        return this
    }
}