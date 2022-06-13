package com.meiji.biz.request.http.platform.contentManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ContentManageAdd extends  PlatformPost{

    {
        super.api = "ContentManage/add"
        super.params = ["title","attachmentUrl","moduleType"]
    }

    ContentManageAdd invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ContentManageAdd preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ContentManageAdd baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
