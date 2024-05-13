package com.credika.biz.request.http.platform.gift

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/25 14:45
 * @Vession V2.6
 */
class AcknowledgmentsManageUpdate extends PlatformPost{
    {
        super.api = "AcknowledgmentsManage/update"
        super.params = ["id","greetings","frontSort","enableShow","updateByName","gmtModified"]
    }

    AcknowledgmentsManageUpdate invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    AcknowledgmentsManageUpdate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
