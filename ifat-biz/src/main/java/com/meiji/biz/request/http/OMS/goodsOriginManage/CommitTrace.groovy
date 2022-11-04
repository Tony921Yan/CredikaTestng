package com.meiji.biz.request.http.OMS.goodsOriginManage
import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class CommitTrace extends OMSPost{
    {
        super.api = "/GoodsOriginManage/commitTrace"
        super.params =["id"]

    }

    CommitTrace invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    CommitTrace preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CommitTrace baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
