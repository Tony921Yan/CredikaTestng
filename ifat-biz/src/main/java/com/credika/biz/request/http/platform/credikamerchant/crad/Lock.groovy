package com.credika.biz.request.http.platform.credikamerchant.crad
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Lock extends PlatformPost{
    {
        super.api = "/otp/card/1817099551659585537/lock"
        super.params = []
    }

    Lock invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Lock baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
