package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext

class UpdateColumn extends com.credika.biz.request.http.platform.PlatformPost {
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
