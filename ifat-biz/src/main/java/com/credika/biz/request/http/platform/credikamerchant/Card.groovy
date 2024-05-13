package com.credika.biz.request.http.platform.credikamerchant
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Card extends PlatformPost{
    {
        super.api = "/card"
        super.params = ["cardLimit","maxAuthAmount","holderName","cardTemplateId","otpCode"]
    }

    Card invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Card baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
