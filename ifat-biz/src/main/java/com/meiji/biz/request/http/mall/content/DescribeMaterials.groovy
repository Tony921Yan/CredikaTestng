package com.meiji.biz.request.http.mall.content

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/07 10:50
 * @Vession V2.5
 */
class DescribeMaterials extends MallPost{
    {
        super.api = "orderExhibit/describeMaterials"
        super.params =["condition","page","rows"]
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
