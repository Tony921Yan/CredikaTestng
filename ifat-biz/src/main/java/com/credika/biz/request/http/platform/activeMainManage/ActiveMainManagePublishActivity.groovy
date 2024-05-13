package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class ActiveMainManagePublishActivity extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ActiveMainManage/publishActivity"
        super.params = ["id","status"]
//        super.preInvoke = "ActiveMainManageOperate"
    }

    ActiveMainManagePublishActivity invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ActiveMainManagePublishActivity preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ActiveMainManagePublishActivity baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
