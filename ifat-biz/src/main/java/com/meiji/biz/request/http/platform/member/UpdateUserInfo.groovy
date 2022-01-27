package com.meiji.biz.request.http.platform.member

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateUserInfo extends PlatformPost{
    {
        super.api="/Memeber/updateUserInfo"
        super.params = ["id","nickname","sex","birthday"]
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

}
