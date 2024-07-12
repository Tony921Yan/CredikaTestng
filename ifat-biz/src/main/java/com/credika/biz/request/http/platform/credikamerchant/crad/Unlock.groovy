package com.credika.biz.request.http.platform.credikamerchant.crad
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Unlock extends PlatformPost{
    {
        super.api = "/otp/card/1802351120063983621/unlock"
        super.params = []
    }

    Unlock invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Unlock baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
