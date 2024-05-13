package com.credika.biz.request.http.platform.shopmanager


import com.miyuan.ifat.support.test.TestContext

class InvitationList extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "invitationList/queryPage"
        super.params =  [ "pageNum","pageSize","applicant","validDate"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    InvitationList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    InvitationList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    InvitationList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
