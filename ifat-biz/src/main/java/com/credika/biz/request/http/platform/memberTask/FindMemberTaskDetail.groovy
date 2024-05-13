package com.credika.biz.request.http.platform.memberTask


import com.miyuan.ifat.support.test.TestContext

class FindMemberTaskDetail extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "TaskManage/findMemberTaskDetail"
        super.params =  [ "id"]

    }

    FindMemberTaskDetail invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindMemberTaskDetail preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindMemberTaskDetail baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
