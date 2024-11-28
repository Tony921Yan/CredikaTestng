package com.credika.biz.request.http.platform.credikamerchant.cardholder

import com.credika.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Inner extends PlatformGet{
    {
        super.api = "/merchant/cardholder/1827890571829637122"
        super.params = []
    }

    Inner invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Inner baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
