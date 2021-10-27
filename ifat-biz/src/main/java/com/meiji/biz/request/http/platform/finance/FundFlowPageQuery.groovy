package com.meiji.biz.request.http.platform.finance

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData

class FundFlowPageQuery extends PlatformPost{
    {
        super.api="OrderFlow/fundFlowPageQuery"
        super.params = ["condition","order","page","rows","sort"]
    }

    FundFlowPageQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FundFlowPageQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FundFlowPageQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    FundFlowPageQuery specialAssert(TestContext testContext){
        List<Map> apiResult = testContext.getResponse().data.dataList
        for (Map map:apiResult){
            Integer actuallyPaidAmount = Integer.valueOf(map.get("actuallyPaidAmount").toString())
            Integer actuallySettleAmount = Integer.valueOf(map.get("actuallySettleAmount").toString())
            Integer actuallyCommission = Integer.valueOf(map.get("actuallyCommission").toString())
            Integer actuallyPlatformIncome = map.get("actuallyPlatformIncome") == null ? 0 : Integer.valueOf(map.get("actuallyPlatformIncome"))
            Integer wechatFee = Integer.valueOf(map.get("wechatFee").toString())
            Integer totalRefundAmount = Integer.valueOf(map.get("totalRefundAmount").toString())
            Integer taxes = Integer.valueOf(map.get("totalRefundAmount").toString())
            Integer subsidyAmount = Integer.valueOf(map.get("subsidyAmount").toString())
            assert actuallyPaidAmount == (actuallySettleAmount + actuallyCommission + actuallyPlatformIncome +wechatFee +
                    totalRefundAmount +taxes +subsidyAmount)
        }
        return  this
    }

}
