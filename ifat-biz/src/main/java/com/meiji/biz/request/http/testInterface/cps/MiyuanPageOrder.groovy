package com.meiji.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class MiyuanPageOrder extends CpsPost200 {
    {
        super.api = "/thirdparty/api/cps/miyuanPageOrder"
        super.params =  ["endTime","oid","page","pageSize","queryType","startTime","status"]
    }

    MiyuanPageOrder invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MiyuanPageOrder preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MiyuanPageOrder baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
