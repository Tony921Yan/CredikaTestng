package com.meiji.biz.request.http.platform.gift

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:16
 * @Vession V2.6
 */
class AcknowledgmentsManage extends PlatformPost{
    {
        super.api = "AcknowledgmentsManage/queryList"
        super.params = ["page","rows"]
    }

    AcknowledgmentsManage invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    AcknowledgmentsManage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
