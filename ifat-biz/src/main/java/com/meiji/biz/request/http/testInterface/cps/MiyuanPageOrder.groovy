package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class MiyuanPageOrder extends CpsPost200 {
    {
        super.api = "/thirdparty/api/cps/miyuanPageOrder"
        super.params =  ["endTime","oid","page","pageSize","queryType","startTime","status"]
    }

    CpsPost200 invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CpsPost200 preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CpsPost200 baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
