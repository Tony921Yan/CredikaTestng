package com.meiji.biz.request.http.platform.cps

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class CostPerSalesListGetSelectedGoods extends PlatformPost {
    {
        super.api = "/CostPerSalesList/getSelectedGoods"
        super.params =  ["goods"]
    }

    CostPerSalesListGetSelectedGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CostPerSalesListGetSelectedGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CostPerSalesListGetSelectedGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    CostPerSalesListGetSelectedGoods specialAssert(TestContext testContext){
        List apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.costPerSalesListGetSelectedGoods()
        System.out.println("apiResult"+apiResult.get(1))
        System.out.println("apiResult"+apiResult.get(1).getAt("spuId"))
        System.out.println("mysqlResult"+mysqlResult)
        assert mysqlResult.spu_id == apiResult.get(1).getAt("spuId")
        return this
    }
}
