package com.credika.biz.request.http.platform.suppiler


import com.miyuan.ifat.support.test.TestContext

class ElectronicContractSumbit extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "/ElectronicContract/sumbit"
        super.params =  ["contractId"]
    }

    ElectronicContractSumbit invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ElectronicContractSumbit preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ElectronicContractSumbit baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
