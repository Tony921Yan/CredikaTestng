package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetGoodsByPage extends PlatformPost{
    {
        super.api = "/platform/goodsMgr/getGoodsByPage"
        super.params = ["categoryId","endDate","endNum","endPrice","pageNum","pageSize","skuCode","spuCodeAndName","startDate",
                         "startNum","startPrice"]
    }

    PlatformPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    PlatformPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    PlatformPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

}
