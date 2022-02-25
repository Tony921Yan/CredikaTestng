package com.meiji.biz.request.http.platform.gift

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 10:28
 * @Vession V2.6
 */
class AcknowledgmentsManageAdd extends PlatformPost{
    {
        super.api = "AcknowledgmentsManage/add"
        super.params = ["greetings","frontSort","enableShow"]
    }

    AcknowledgmentsManageAdd invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    AcknowledgmentsManageAdd baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
