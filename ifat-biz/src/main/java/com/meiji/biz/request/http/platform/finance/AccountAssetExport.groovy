package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Result

class AccountAssetExport extends PlatformPost{
    {
        super.api="AccountAssets/accountAssetExport"
        super.params = ["condition"]
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
        Result result = testContext.getResult() as Result
        assert result.getHttpStatusCode() == 200
        return this
    }

}
