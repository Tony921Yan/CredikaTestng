package com.meiji.biz.request.http.mall.userInfo

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession history
 * */
class GetOssConfig extends MallPost {
    {
        super.api = "config/getOssConfig"
        super.params =  [ "maxSize"]
    }

    GetOssConfig invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetOssConfig preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetOssConfig baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetOssConfig specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }
}
