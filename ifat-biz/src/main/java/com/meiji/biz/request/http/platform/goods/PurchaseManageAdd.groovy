package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/23 14:21
 * @Vession V2.5
 */
class PurchaseManageAdd extends PlatformPost{
    {
        super.api = "PurchaseManage/add"
        super.params = ["name","email","phone"]
    }

    PurchaseManageAdd invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    PurchaseManageAdd baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
