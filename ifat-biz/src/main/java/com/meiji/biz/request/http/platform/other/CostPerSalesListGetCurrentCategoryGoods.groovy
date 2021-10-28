package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class CostPerSalesListGetCurrentCategoryGoods extends PlatformPost {
    {
        super.api = "/CostPerSalesList/getCurrentCategoryGoods"
        super.params =  ["id"]
    }

    CostPerSalesListGetCurrentCategoryGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CostPerSalesListGetCurrentCategoryGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CostPerSalesListGetCurrentCategoryGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    CostPerSalesListGetCurrentCategoryGoods specialAssert(TestContext testContext){
        List apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.costPerSalesListGetCurrentCategoryGoods(testContext.get("id"))
        System.out.println("apiResult"+apiResult.get(0))
        System.out.println("apiResult"+apiResult.get(0).getAt("spuId"))
        System.out.println("mysqlResult"+mysqlResult)
        assert mysqlResult.spu_id == apiResult.get(0).getAt("spuId")
        assert mysqlResult.sort == apiResult.get(0).getAt("sort")
        return this
    }
}


