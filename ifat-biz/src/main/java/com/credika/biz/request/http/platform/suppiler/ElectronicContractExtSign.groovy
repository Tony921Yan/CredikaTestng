package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class ElectronicContractExtSign extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/ElectronicContract/extSign"
        super.params =  ["contractId"]
    }

    ElectronicContractExtSign invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ElectronicContractExtSign preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ElectronicContractExtSign baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
