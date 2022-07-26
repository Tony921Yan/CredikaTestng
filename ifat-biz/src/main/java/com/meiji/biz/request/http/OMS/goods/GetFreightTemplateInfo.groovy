package com.meiji.biz.request.http.OMS.goods
import com.meiji.biz.request.http.OMS.OMSPost
import com.miyuan.ifat.support.test.TestContext

class GetFreightTemplateInfo extends OMSPost{
    {
        super.api = "GoodsDetailManage/getFreightTemplateInfo"
        super.params =["id","supplierId"]

    }
    GetFreightTemplateInfo invoke(TestContext testContext){
        super.invoke(testContext)
        return this
}

    GetFreightTemplateInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetFreightTemplateInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
