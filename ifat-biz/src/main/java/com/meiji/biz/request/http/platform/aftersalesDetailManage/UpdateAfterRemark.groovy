package com.meiji.biz.request.http.platform.aftersalesDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateAfterRemark extends PlatformPost{
    {
        super.api = "AftersalesDetailManage/updateAfterRemark"
       super.params = ["afterCode","userId","userName","remark"]
    }

    UpdateAfterRemark invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateAfterRemark preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateAfterRemark baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
