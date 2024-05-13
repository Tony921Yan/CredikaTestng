package com.credika.biz.request.http.OMS.goodsOriginManage
import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class UpdateTrace extends OMSPost{
    {
        super.api = "/GoodsOriginManage/updateTrace"
        super.params =["id","pics","text","title","videos"]

    }

    UpdateTrace invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    UpdateTrace preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateTrace baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
