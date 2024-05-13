package com.credika.biz.request.http.platform.goods

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/02/23 14:21
 * @Vession V2.5
 */
class PurchaseManageAdd extends PlatformPost{
    {
        super.api = "PurchaseManage/add"
        super.params = ["name","email","phone"]
    }

    PurchaseManageAdd invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    PurchaseManageAdd baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PurchaseManageAdd specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.purchaseManageList(testContext.get("email"))
        testContext.put("id",mysqlResult.get("id"))
        System.out.println("查看是否将mysqlResult的id是否存在testContext中："+ testContext)
        System.out.println("specialAssert结果:"+ mysqlResult)
    }
}
