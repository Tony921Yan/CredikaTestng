package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class WithdrawRecordPageQuery extends PlatformPost{
    {
        super.api="Withdraw/withdrawRecordPageQuery"
        super.params = ["condition","order","page","rows","sort"]
    }

    WithdrawRecordPageQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    WithdrawRecordPageQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    WithdrawRecordPageQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
