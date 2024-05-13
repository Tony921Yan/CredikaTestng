package com.credika.biz.request.http.platform.credikamerchant.creditlimit
import com.credika.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Page extends PlatformGet{
    {
        super.api = "/merchant/account/transaction/page?page=1&size=5"
        super.params = []
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
