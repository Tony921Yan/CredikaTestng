package com.credika.biz.request.http.platform.channel


import com.miyuan.ifat.support.test.TestContext

class AddBuyerShow extends com.credika.biz.request.http.platform.PlatformPost {
    {
        super.api = "ShareOrderManage/addBuyerShow"
        super.params =  [ "businessType","columnId","cover","pics","spuId","text","title","videos","isOfficial"]
    }

    AddBuyerShow invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    AddBuyerShow preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    AddBuyerShow baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

}
