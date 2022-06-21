package com.meiji.biz.request.http.mall.userAddress

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class DeleteUserAddress extends MallPost {
    {
        super.api = "/userAddress/deleteUserAddress"
        super.params =  ["id"]
//        super.preInvoke = "com.miyuan.request.api.goods.CenterSearch"
    }


    DeleteUserAddress specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.getUserAddress(testContext.get("id"))
        assert mysqlResult == null
        return this
    }

}
