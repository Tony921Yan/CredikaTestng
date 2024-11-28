package com.credika.biz.request.http.platform.credikamerchant.cardholder
import com.credika.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Status extends PlatformGet{
    {
        super.api = "/merchant/kyb/status"
        super.params = []
    }

    Status invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Status baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
