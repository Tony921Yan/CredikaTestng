package com.credika.biz.request.http.mall.orderExhibit

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/07 10:50
 * @Vession V2.5
 */
class DescribeMaterials extends MallPost{
    {
        super.api = "orderExhibit/describeMaterials"
        super.params =["condition","page","rows","order","sort"]
    }

    DescribeMaterials invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    DescribeMaterials baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
