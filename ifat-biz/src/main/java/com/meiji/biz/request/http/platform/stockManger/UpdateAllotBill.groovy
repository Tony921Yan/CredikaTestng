package com.meiji.biz.request.http.platform.stockManger
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
class UpdateAllotBill extends PlatformPost{
    {
        super.api="StockManage/updateAllotBill"
        super.params = ["adjustId","goods","goodsName","preNum","skuCode","skuId","spuCode","spuId","operation"]
    }

    UpdateAllotBill invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateAllotBill preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    UpdateAllotBill baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
