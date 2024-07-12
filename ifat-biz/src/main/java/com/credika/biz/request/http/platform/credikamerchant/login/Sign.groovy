package com.credika.biz.request.http.platform.credikamerchant.login
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Sign extends PlatformPost{
    {
        super.api = "/signIn"
        super.params = ["username","password"]
    }

    Sign invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Sign baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
