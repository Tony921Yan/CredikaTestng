package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost

import com.miyuan.ifat.support.test.TestContext

class GetPromotionalInfo extends PlatformPost{
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
