package com.credika.biz.request.http.platform.credikamerchant.cardholder
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class Update extends PlatformPost{
    {
        super.api = "/merchant/cardholder/1814498134692261889/update"
        super.params = ["address","birthDate","city","contactNumber","country","countryCode","gender","postCode","state"]
    }

    Update invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Update baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
