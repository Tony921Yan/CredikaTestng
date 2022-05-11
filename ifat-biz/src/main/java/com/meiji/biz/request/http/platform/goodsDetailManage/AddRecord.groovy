package com.meiji.biz.request.http.platform.goodsDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class AddRecord extends PlatformPost{
    {
        super.api = "GoodsDetailManage/addRecord"
       super.params = ["id","level","remark"]
    }

    AddRecord invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddRecord preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddRecord baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
