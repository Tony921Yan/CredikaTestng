package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class InvitationListQueryPage extends PlatformPost {
    {
        super.api = "/invitationList/queryPage"
        super.params =  [ "pageNum","pageSize","applicant","validDate"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    PlatformPost specialAssert(TestContext testContext){
        Map apiDate = testContext.getResponse().date
        System.out.print("apiDate:" + apiDate)
        assert apiDate.total > 20
    }
}
