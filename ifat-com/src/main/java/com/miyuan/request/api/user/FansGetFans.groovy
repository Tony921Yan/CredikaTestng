package com.miyuan.request.api.user

import com.miyuan.com.TestContext
import com.miyuan.factory.MiyuanRequest

class FansGetFans extends MiyuanRequest {
   {
        super.api = "/api/user/fans/getFans"
        super.params =  [ "filterType", "page", "sort", "sortType", "type" ]
    }

    MiyuanRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MiyuanRequest preInvoke(TestContext testContext){

    }

    MiyuanRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MiyuanRequest specialAssert(TestContext testContext){

    }
}

