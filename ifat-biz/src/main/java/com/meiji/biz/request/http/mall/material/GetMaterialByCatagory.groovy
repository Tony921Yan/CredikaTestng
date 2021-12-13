package com.meiji.biz.request.http.mall.material

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class GetMaterialByCatagory extends MallPost {
    {
        super.api = "material/getMaterialByCatagory"
        super.params =  ["page","rows","shopId","id"]
    }

    GetMaterialByCatagory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetMaterialByCatagory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetMaterialByCatagory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
