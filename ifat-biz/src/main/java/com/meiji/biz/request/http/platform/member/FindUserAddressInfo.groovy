package com.meiji.biz.request.http.platform.member

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext
import org.junit.Assert

class FindUserAddressInfo extends PlatformPost{
    {
        super.api="/Memeber/findUserAddressInfo"
        super.params = ["id"]
    }

    FindUserAddressInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUserAddressInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindUserAddressInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    FindUserAddressInfo specialAssert(TestContext testContext){
        List apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.findUserAddressInfo()
        System.out.println("apiResult"+apiResult)
        System.out.println("mysqlResult"+mysqlResult)
        assert mysqlResult.district_code == apiResult.get(0).getAt("districtCode")
        assert mysqlResult.id_card_number == apiResult.get(0).getAt("idCardNumber")
        return this
    }

}
