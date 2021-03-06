package com.meiji.request.http.goods

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class UpdateGoods extends MeijiRequest{
    {
        super.api = ""
        super.params = [["backgroundCategoryId","brandId","detail","frontDeskCategoryId","id","manyProperty",
                         "name","originAddress","pics","sellingPoint","skus","updateBy","updateByName"]]
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
