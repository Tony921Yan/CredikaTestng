package com.credika.biz.request.http.platform.activeMainManage


import com.miyuan.ifat.support.test.TestContext

class GetPromotionalInfo extends com.credika.biz.request.http.platform.PlatformPost{
    {
        super.api = "ActiveMainManage/getPromotionalInfo" //接口地址
        super.params = ["referId"]   //请求参数
    }


    GetPromotionalInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetPromotionalInfo invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }


    GetPromotionalInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
