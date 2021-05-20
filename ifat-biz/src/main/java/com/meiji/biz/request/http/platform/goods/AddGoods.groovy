package com.meiji.biz.request.http.platform.goods

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddGoods extends PlatformPost{
    {
        super.api = "/platform/goodsMgr/addGoods"
        super.params = ["backgroundCategoryId","brandId","createBy","createByName","detail","frontDeskCategoryId",
                         "manyProperty","name","originAddress","pics","sellingPoint","skus","supplierCode",
                        "supplierId","updateBy","updateByName"]
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
