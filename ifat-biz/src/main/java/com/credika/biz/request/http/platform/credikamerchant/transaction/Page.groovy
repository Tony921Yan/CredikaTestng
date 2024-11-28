package com.credika.biz.request.http.platform.credikamerchant.transaction
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Page extends PlatformPost{
    {
        super.api = "/transaction/page"
        super.params = ["page","size"]
    }

    Page invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Page baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
