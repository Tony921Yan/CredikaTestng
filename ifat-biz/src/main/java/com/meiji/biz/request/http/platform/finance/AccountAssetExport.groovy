package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AccountAssetExport extends PlatformPost{
    {
        super.api="AccountAssets/accountAssetExport"
        super.params = ["condition","order","page","rows","sort"]
    }

    AccountAssetExport invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AccountAssetExport preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AccountAssetExport baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
