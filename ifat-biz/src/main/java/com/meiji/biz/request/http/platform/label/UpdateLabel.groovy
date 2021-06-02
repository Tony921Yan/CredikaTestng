package com.meiji.biz.request.http.platform.label

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateLabel extends PlatformPost{
    {
        super.api="/platform/goodsLabel/updateLabel"
        super.params = ["gmtCreate","gmtModified","id","isDelete","labelColor","labelName","labelRemark","labelType",
        "page","rows","showType"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
