package com.credika.biz.request.http.platform.activeMainManage.giftManage


import com.miyuan.ifat.support.test.TestContext

class QuerySubjectPage extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "SubjectManage/querySubjectPage"
        super.params = ["page","rows","status"]
    }

    QuerySubjectPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    QuerySubjectPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    QuerySubjectPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
