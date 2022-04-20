package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class ActiveMainManageUpdate extends PlatformPost{
    {
        super.api = "ActiveMainManage/update"
       super.params = ["expiryEnd","expiryStart","name","preTime","remark","secKillActivity","status","type","id"]
    }

    ActiveMainManageUpdate invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    ActiveMainManageUpdate preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    ActiveMainManageUpdate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
