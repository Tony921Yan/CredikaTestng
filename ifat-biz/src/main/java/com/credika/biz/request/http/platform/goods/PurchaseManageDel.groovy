package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/23 17:34
 * @Vession V2.6
 */
class PurchaseManageDel extends PlatformPost{
    {
        super.api = "PurchaseManage/del"
        super.params = ["id"]
    }

    PurchaseManageDel invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    PurchaseManageDel baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
