package com.meiji.biz.request.http.platform.channel

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext
/**
 *
 @author Remy
 @create 2021/11/18-17:50
 @version v2.1
 */
class GetGoods extends PlatformPost {
    {
        super.api = "ColumnManagement/getGoods"
        super.params =  ["page","rows","columnId"]
    }

    GetGoods invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGoods preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
