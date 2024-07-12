package com.credika.biz.request.http.platform.credikamerchant.crad
import com.credika.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Recharge extends PlatformGet{
    {
        super.api = "/card/1802351120063983621/recharge/page?page=1&size=5"
        super.params = []
    }

    Recharge invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Recharge baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
