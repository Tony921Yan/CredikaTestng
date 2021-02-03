package com.miyuan.request.api.user

import com.miyuan.com.TestContext
import com.miyuan.factory.MiyuanRequest

class getUserPageDate extends MiyuanRequest {
   {
        super.api = "/api/proxy/personal/getUserPageData"

    }

    MiyuanRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }


    MiyuanRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        def incomeInfoList = testContext.getResponse().data.incomeInfo
        assert incomeInfoList.size() == 5
    }


}

