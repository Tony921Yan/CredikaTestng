package com.meiji.biz.request.http.mall.activeRecord

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

class GetRaffleSubsuribe extends MallPost{
    {
        super.api = "activeRecord/getRaffleSubsuribe"
        super.params = ["actId"]
    }

    GetRaffleSubsuribe invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetRaffleSubsuribe preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetRaffleSubsuribe baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
