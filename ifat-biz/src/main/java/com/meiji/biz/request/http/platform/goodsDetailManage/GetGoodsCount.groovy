package com.meiji.biz.request.http.platform.goodsDetailManage

import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class GetGoodsCount extends PlatformPost{
    {
        super.api = "GoodsDetailManage/getGoodsCount"
       super.params = ["pageNum","pageSize","goodsType","isCompensation","status","spuName","supplierId","comparePrice"]
    }

    GetGoodsCount invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetGoodsCount preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetGoodsCount baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
