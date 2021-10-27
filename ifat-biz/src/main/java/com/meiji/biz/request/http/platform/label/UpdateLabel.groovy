package com.meiji.biz.request.http.platform.label

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateLabel extends PlatformPost{
    {
        super.api="/platform/goodsLabel/updateLabel"
        super.params = ["gmtCreate","gmtModified","id","isDelete","labelColor","labelName","labelRemark","labelType",
        "page","rows","showType"]
    }

    UpdateLabel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateLabel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateLabel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
