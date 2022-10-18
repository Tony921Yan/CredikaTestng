package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Result

class WithdrawRecordExport extends PlatformPost{
    {
        super.api="withdraw/withdrawRecordExport"
        super.params = ["condition"]
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
        Result result = testContext.getResult() as Result
        assert result.getHttpStatusCode() == 200
        return this
    }

}
