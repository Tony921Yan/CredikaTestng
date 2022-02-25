package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/23 9:39
 * @Vession V2.6
 */
class PurchaseManageList extends PlatformPost{
    {
        super.api = "PurchaseManage/list"
        super.params = ["page","rows","email","name","phone"]
    }

    PurchaseManageList invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    PurchaseManageList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
