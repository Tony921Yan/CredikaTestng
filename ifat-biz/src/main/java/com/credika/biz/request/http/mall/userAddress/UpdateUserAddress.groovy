package com.credika.biz.request.http.mall.userAddress
import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.AddressService
import com.miyuan.ifat.support.test.TestContext

class UpdateUserAddress extends MallPost {
    {
        super.api = "userAddress/updateUserAddress"
        super.params =  ["address","city","cityCode","district","districtCode","id","isDefault","phone","province","provinceCode",
                         "recipient","remark"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    UpdateUserAddress specialAssert(TestContext testContext){
        AddressService.addressAssert(testContext)
        return this
    }
}
