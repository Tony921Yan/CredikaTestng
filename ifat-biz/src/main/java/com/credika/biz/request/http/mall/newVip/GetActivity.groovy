package com.credika.biz.request.http.mall.newVip

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetActivity extends MallPost{
    {
        super.api = "newVip/getActivity"
       super.params = [ ]
    }

    GetActivity invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetActivity preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetActivity baseAssert(TestContext testContext){
        //assert testContext.getResponse().code == 10
        super.baseAssert(testContext)
        return this
    }


}
