package com.credika.biz.request.http.OMS.goods
import com.credika.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class QueryPage extends OMSPost{
    {
        super.api = "/goodsLabelList/queryPage"
        super.params =["labelsType","pageNum","pageSize"]

    }
    QueryPage invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    QueryPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QueryPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
