package com.credika.biz.service

import com.miyuan.ifat.support.test.TestContext

class AddressService {
    static void addressAssert(TestContext testContext){
        //利用更新接口请求的sql和查询接口返回值做断言
        Map mysqlResult = MysqlService.getUserAddress(testContext.get("id"))
        assert mysqlResult.recipient == testContext.get("recipient")
        assert mysqlResult.phone == testContext.get("phone")
        assert mysqlResult.province == testContext.get("province")
        assert mysqlResult.province_code == testContext.get("provinceCode")
        assert mysqlResult.city == testContext.get("city")
        assert mysqlResult.city_code == testContext.get("cityCode")
        assert mysqlResult.district == testContext.get("district")
        assert mysqlResult.district_code == testContext.get("districtCode")
        assert mysqlResult.address == testContext.get("address")
        assert mysqlResult.remark == testContext.get("remark")
        assert mysqlResult.is_default.toString() == testContext.get("isDefault")
    }
}
