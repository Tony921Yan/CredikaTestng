package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class WithdrawRecordExport extends PlatformPost{
    {
        super.api="/platform/finance/withdrawRecordExport"
        super.params = ["condition","order","page","rows","sort"]
    }

    WithdrawRecordExport invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    WithdrawRecordExport preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    WithdrawRecordExport baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
