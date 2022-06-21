package com.meiji.biz.request.http.mall.userAddress

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil


class FindDefaultUserAddress extends MallPost {
    {
        super.api = "/userAddress/findDefaultUserAddress"
        super.params =  ["userId"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }
    FindDefaultUserAddress specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        if(apiResult==null){
            return this
        }
        Map mysqlResult = MysqlService.getUserAddress(apiResult.id.toString())
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
