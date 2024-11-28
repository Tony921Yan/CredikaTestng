package com.credika.biz.request.http.platform.credikamerchant.cardholder
import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author TONYYAN-SINGAPORE*
 * @Vession V2.6
 */
class Cardholder extends PlatformPost{
    {
        super.api = "/merchant/cardholder"
        super.params = ["firstname","lastname","contactMail","contactNumber","gender","birthDate","country","address","state","city","postCode","countryCode"]
    }

    Cardholder invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    Cardholder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
