package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/23 17:24
 * @Vession V2.6
 */
class PurchaseManageUpdate extends PlatformPost{
    {
        super.api = "PurchaseManage/update"
        super.params = ["id","name","email","phone"]
    }

    PurchaseManageUpdate invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    PurchaseManageUpdate baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
