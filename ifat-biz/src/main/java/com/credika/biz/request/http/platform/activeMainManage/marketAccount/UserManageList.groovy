package com.credika.biz.request.http.platform.activeMainManage.marketAccount


import com.miyuan.ifat.support.test.TestContext

class UserManageList extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "UserManage/list"
       super.params = ["pageSize"]
    }

    UserManageList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UserManageList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UserManageList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
