package com.meiji.biz.request.http.mall.user

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext
/**
 * @author Remy
 * * @date 2022/03/19 23:18
 * @Vession V2.6.3
 * */
class GetGroupQrCode extends MallPost {
    {
        super.api = "user/getGroupQrCode"
        super.params =  []
    }

    GetGroupQrCode invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGroupQrCode preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGroupQrCode baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetGroupQrCode specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }
}
