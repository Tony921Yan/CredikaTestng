package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ActiveMainManagePublishActivity extends PlatformPost{
    {
        super.api = "ActiveMainManage/publishActivity"
        super.params = ["id","status"]
//        super.preInvoke = "com.meiji.biz.request.http.platform.activeMainManage.ActiveMainManageOperate"
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
