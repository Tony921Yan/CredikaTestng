package com.meiji.biz.request.http.mall.userAddress
import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext
import com.meiji.biz.request.http.mall.userAddress.FindUserAddressList

class UpdateUserAddress extends MallPost {
    {
        super.api = "userAddress/updateUserAddress"
        super.params =  ["address","city","cityCode","district","districtCode","id","isDefault","phone","province","provinceCode",
                         "recipient","remark"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }

    MallPost invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    MallPost preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    MallPost baseAssert(TestContext testContext){
        super.baseAssert(testContext)
    }

    MallPost specialAssert(TestContext testContext){
        //利用更新接口请求的sql和查询接口返回值做断言
        Map mysqlResult = MysqlService.updateUserAddress(testContext.get("id")).get(0)
        Map apiResult = testContext.getResponse().data[0]
        System.out.println(apiResult)
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

    }

}
