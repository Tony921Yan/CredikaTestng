package com.meiji.biz.request.http.platform.member

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class FindUserInfo extends PlatformPost{
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
        System.out.println("apiResult" + apiResult)
        List mysqlResult = MysqlService.findUserInfo(testContext.get("id"))
        System.out.println("mysqlResult" + mysqlResult)
        assert mysqlResult.get(0).get("phone") == apiResult.phone
        assert mysqlResult.get(0).get("avatar") == apiResult.avatar
        assert mysqlResult.get(0).get("birthday") == apiResult.birthday
        assert DateUtil.strToDate(mysqlResult.get(0).get("gmt_create") as String) == DateUtil.strToDate(apiResult.gmtCreate)
        return this
    }
}