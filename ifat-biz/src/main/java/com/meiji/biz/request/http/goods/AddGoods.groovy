package com.meiji.biz.request.http.goods

import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.MeijiRequest

class AddGoods extends MeijiRequest{
    {
        super.api = "/platform/goodsMgr/addGoods"
        super.params = ["backgroundCategoryId","brandId","createBy","createByName","detail","frontDeskCategoryId",
                         "manyProperty","name","originAddress","pics","sellingPoint","skus","supplierCode",
                        "supplierId","updateBy","updateByName"]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MeijiRequest preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MeijiRequest baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }
}
