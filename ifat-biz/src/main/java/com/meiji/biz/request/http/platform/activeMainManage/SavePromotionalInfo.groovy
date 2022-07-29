package com.meiji.biz.request.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.PlatformPost

import com.miyuan.ifat.support.test.TestContext

class SavePromotionalInfo extends PlatformPost{
    {
        super.api = "ActiveMainManage/savePromotionalInfo"    //接口地址
        super.params = ["extra","h5Link","pageLink","qrCodeUrl","referId","shortLink","specifiedShop"]   //接口参数
    }

//    SavePromotionalInfo afterInvoke(TestContext testContext) {
//        String fetchId = testContext.getResponse().data.data
//        assert fetchId != null
//        testContext.put("fetchId",fetchId)
//        return this
//    }

//    AddUserAddress specialAssert(TestContext testContext){
//        AddressService.addressAssert(testContext)
//        return this
//    }

    SavePromotionalInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    SavePromotionalInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    SavePromotionalInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }


}
