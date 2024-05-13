package com.credika.biz.request.http.OMS.goodsOriginManage

import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class AddTrace extends OMSPost{
    {
        super.api = "/GoodsOriginManage/addTrace"
        super.params =["nickName","pics","spuId","supplierId","text","title","videos"]

    }

    AddTrace invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    AddTrace preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddTrace baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
