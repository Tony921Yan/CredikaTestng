package com.meiji.biz.request.http.platform.other

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class CostPerSalesListSaveCpsGoods extends PlatformPost {
    {
        super.api = "/CostPerSalesList/saveCpsGoods"
        super.params =  ["cpsCategoryId","goods"]
    }

    CostPerSalesListSaveCpsGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    CostPerSalesListSaveCpsGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CostPerSalesListSaveCpsGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
