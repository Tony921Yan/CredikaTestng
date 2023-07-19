package com.meiji.biz.request.http.platform.hfjy
import com.meiji.biz.request.http.platform.PlatformGet
import com.miyuan.ifat.support.test.TestContext
class List extends PlatformGet{
    {
        super.api="/platform/menu/list"
        super.params = []
    }

    List invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    List preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    List baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
