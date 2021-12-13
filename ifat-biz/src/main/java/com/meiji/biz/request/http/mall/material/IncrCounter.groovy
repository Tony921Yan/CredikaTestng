package com.meiji.biz.request.http.mall.material

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class IncrCounter extends MallPost {
    {
        super.api = "material/incrCounter"
        super.params =  ["id","actionType"]
    }

    IncrCounter invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    IncrCounter preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    IncrCounter baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
