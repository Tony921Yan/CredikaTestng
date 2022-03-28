package com.meiji.biz.request.http.platform.stockManger
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class SearchActivityGoods extends PlatformPost{
    {
        super.api="StockManage/searchActivityGoods"
        super.params = ["condition","page","rows"]
    }

    SearchActivityGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SearchActivityGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SearchActivityGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
