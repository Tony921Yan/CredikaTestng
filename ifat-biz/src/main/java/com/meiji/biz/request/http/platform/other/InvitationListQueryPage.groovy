package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class InvitationListQueryPage extends PlatformPost {
    {
        super.api = "/invitationList/queryPage"
        super.params =  [ "pageNum","pageSize","applicant","validDate"]
    }

    InvitationListQueryPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    InvitationListQueryPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    InvitationListQueryPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    InvitationListQueryPage specialAssert(TestContext testContext){
        Map apiDate = testContext.getResponse().date
        System.out.print("apiDate:" + apiDate)
        assert apiDate.total > 20
        return this
    }
}
