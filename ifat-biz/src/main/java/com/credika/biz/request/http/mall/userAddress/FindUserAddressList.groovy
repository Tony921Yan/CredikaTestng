package com.credika.biz.request.http.mall.userAddress

import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class FindUserAddressList extends MallPost {
    {
        super.api = "/userAddress/findUserAddressList"
        super.params =  ["userId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    FindUserAddressList specialAssert(TestContext testContext){
        List addressList = testContext.getResponse().data
        if(addressList.size()==0){
            Map mysqlResult = MysqlService.findUserAddressList(testContext.get("userId"))
            assert mysqlResult==null
            return this
        }
        Map apiResult = addressList.get(0)
        Map mysqlResult = MysqlService.findUserAddressList(testContext.get("userId"))
        assert mysqlResult.id == apiResult.id
        assert mysqlResult.recipient == apiResult.recipient
        assert mysqlResult.phone == apiResult.phone
        assert mysqlResult.province == apiResult.province
        assert mysqlResult.province_code == apiResult.provinceCode
        assert mysqlResult.city == apiResult.city
        assert mysqlResult.city_code == apiResult.cityCode
        assert mysqlResult.district == apiResult.district
        assert mysqlResult.district_code == apiResult.districtCode
        assert mysqlResult.address == apiResult.address
        assert mysqlResult.remark == apiResult.remark
        assert mysqlResult.is_default == apiResult.isDefault
        return this
    }


}
