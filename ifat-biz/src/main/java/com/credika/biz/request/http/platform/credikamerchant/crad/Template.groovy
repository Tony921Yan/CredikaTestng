package com.credika.biz.request.http.platform.credikamerchant.crad
import com.credika.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Template extends PlatformGet{
    {
        super.api = "/card/template"
        super.params = []
    }

    Template invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Template baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
