package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class UpdateGoods extends PlatformPost{
    {
        super.api = "/platform/goodsMgr/updateGoods"
        super.params = [["backgroundCategoryId","brandId","detail","frontDeskCategoryId","id","manyProperty",
                         "name","originAddress","pics","sellingPoint","skus","updateBy","updateByName"]]
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
