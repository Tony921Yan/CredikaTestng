package com.meiji.biz.request.http.OMS.goods
import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class QueryGoodPropertys extends OMSPost{
    {
        super.api = "AttrManagement/queryGoodPropertys"
        super.params =["condition","page","rows"]

    }
    QueryGoodPropertys invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    QueryGoodPropertys preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QueryGoodPropertys baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
