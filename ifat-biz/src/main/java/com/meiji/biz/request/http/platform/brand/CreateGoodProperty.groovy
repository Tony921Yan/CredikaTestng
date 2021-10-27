package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class CreateGoodProperty extends PlatformPost{
    {
        super.api = "/platform/goodPropertyMgr/createGoodProperty";
        super.params = ["createBy","gmtCreate","goodPropertyValues","id","isMust",
                         "isSearch","name","remark","status","type","updateBy"]
    }

    CreateGoodProperty invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CreateGoodProperty preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CreateGoodProperty baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    CreateGoodProperty specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }

}
