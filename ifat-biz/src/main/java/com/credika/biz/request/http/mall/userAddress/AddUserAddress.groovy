package com.credika.biz.request.http.mall.userAddress

import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.AddressService
import com.miyuan.ifat.support.test.TestContext

class AddUserAddress extends MallPost {
    {
        super.api = "/userAddress/addUserAddress"
        super.params =  ["address","city","cityCode","district","districtCode","isDefault","phone","province","provinceCode",
                         "recipient","remark"]
    }


    AddUserAddress afterInvoke(TestContext testContext){
        String addressId = testContext.getResponse().data.data
        assert addressId != null
        testContext.put("id",addressId)
        return this
    }

    AddUserAddress specialAssert(TestContext testContext){
        AddressService.addressAssert(testContext)
        return this
    }

}
