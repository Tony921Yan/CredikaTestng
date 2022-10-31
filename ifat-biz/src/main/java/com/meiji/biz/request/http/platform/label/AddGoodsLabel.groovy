package com.meiji.biz.request.http.platform.label

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddGoodsLabel extends PlatformPost{
    {
        super.api = "goodsLabelList/addGoodsLabel"
        super.params = ["labelType","labelName","location","priority","showType","duration","picture","titlePicture"]
    }

    AddGoodsLabel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddGoodsLabel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddGoodsLabel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    AddGoodsLabel specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        assert apiResult.total > 20
        return this
    }
}
