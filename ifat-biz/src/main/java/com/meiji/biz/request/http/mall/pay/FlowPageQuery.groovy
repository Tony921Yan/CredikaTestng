package com.meiji.biz.request.http.mall.pay

import com.meiji.biz.request.http.shop.ShopPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class FlowPageQuery extends ShopPost {
    {
        super.api = "pay/flowPageQuery"
        super.params =  ["condition","page","rows"]
    }

    FlowPageQuery invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FlowPageQuery preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FlowPageQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    FlowPageQuery specialAssert(TestContext testContext){
        List<Map> apiResult = testContext.getResponse().data.dataList
        Map mysqlResult = MysqlService.flowPageQuery()
        assert apiResult.get(0).tradeAmount == mysqlResult.trade_amount
        assert apiResult.get(0).orderNo == mysqlResult.trade_order_no
        assert apiResult.get(0).state == mysqlResult.state
        assert apiResult.get(0).type == mysqlResult.type
        assert DateUtil.strToDate(apiResult.get(0).gmtCreate)  == DateUtil.strToDate(mysqlResult.gmt_create as String)
        assert apiResult.get(0).tradeType == mysqlResult.trade_type

    }
}
