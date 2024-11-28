package com.credika.biz.request.http.platform.credikamerchant.crad
import com.credika.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class AuthTransaction extends PlatformGet{
    {
        super.api = "/card/1817099551659585537/authTransaction"
        super.params = ["page","size"]
    }

    AuthTransaction invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    AuthTransaction baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
