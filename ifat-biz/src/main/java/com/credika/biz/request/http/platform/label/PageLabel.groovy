package com.credika.biz.request.http.platform.label

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class PageLabel extends PlatformPost{
    {
        super.api="goodsLabelList/queryPage"
        super.params = ["gmtCreate","gmtModified","id","isDelete","labelColor","labelName","labelRemark","labelType",
        "page","rows","showType"]
    }

    PageLabel invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageLabel preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageLabel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
