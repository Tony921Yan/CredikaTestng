package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class CostPerSalesListRemoveCpsGoods extends PlatformPost {
    {
        super.api = "CostPerSalesList/removeCpsGoods"
        super.params =  ["cpsCategoryId","spuId"]
    }

    CostPerSalesListRemoveCpsGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CostPerSalesListRemoveCpsGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CostPerSalesListRemoveCpsGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
