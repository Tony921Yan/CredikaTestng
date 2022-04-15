package com.meiji.biz.request.http.platform.workOrder
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class PageOrderIssue extends PlatformPost{
    {
        super.api="/WorkOrder/pageOrderIssue"
        super.params = ["condition","page","rows"]
    }

    PageOrderIssue invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PageOrderIssue preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PageOrderIssue baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
