package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateColumn extends PlatformPost {
    {
        super.api = "ColumnManagement/updateColumn"
        super.params =  ["childName","id","name","remark"]
    }

    UpdateColumn invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateColumn preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateColumn baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
