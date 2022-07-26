package com.meiji.biz.request.http.OMS.goods
import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GuideDetail extends OMSPost{
    {
        super.api = "OrderDetailManage/guideDetail"
        super.params =["type"]

    }
    GuideDetail invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    GuideDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GuideDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
