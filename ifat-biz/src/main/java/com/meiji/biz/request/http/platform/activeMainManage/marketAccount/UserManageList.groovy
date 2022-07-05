package com.meiji.biz.request.http.platform.activeMainManage.marketAccount

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UserManageList extends PlatformPost{
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
