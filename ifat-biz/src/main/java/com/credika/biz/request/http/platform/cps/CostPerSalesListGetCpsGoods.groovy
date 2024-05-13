package com.credika.biz.request.http.platform.cps

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.credika.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class CostPerSalesListGetCpsGoods extends PlatformPost {
    {
        super.api = "CostPerSalesList/getCpsGoods"
        super.params =  ["page","rows","condition"]
    }

    CostPerSalesListGetCpsGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CostPerSalesListGetCpsGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CostPerSalesListGetCpsGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    CostPerSalesListGetCpsGoods specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.costPerSalesListGetCpsGoods()
        System.out.println("apiResult"+apiResult)
        System.out .println("mysqlResult"+mysqlResult)
        assert apiResult.total > 20
        assert mysqlResult.code == apiResult.dataList.getAt(7).getAt("spuCode")
        assert mysqlResult.fre_asked_questions == apiResult.dataList.getAt(7).getAt("freAskedQuestions")
        assert DateUtil.strToDate(mysqlResult.publish_time as String) == DateUtil.strToDate(apiResult.dataList.getAt(7).getAt("publishTime"))
        return this
    }
}
