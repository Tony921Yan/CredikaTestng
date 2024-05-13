package com.credika.biz.request.http.testInterface.cps


import com.miyuan.ifat.support.test.TestContext

class MiyuanPageOrder extends CpsPost {
    {
        Object.api = "/thirdparty/api/cps/miyuanPageOrder"
        Object.params =  ["endTime", "oid", "page", "pageSize", "queryType", "startTime", "status"]
    }

    MiyuanPageOrder invoke(TestContext testContext) {
        Object.invoke(testContext)
        return this
    }

    MiyuanPageOrder preInvoke(TestContext testContext){
        Object.preInvoke(testContext)
        return this
    }

    MiyuanPageOrder baseAssert(TestContext testContext){
        assert testContext.getResponse().code == "200"
        return this
    }

}
