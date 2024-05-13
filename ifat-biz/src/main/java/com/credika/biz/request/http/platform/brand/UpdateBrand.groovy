package com.credika.biz.request.http.platform.brand

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class UpdateBrand extends PlatformPost{
    {
        super.api = "BrandManage/updateBrand"
        super.params = ["createBy","gmtCreate","gmtModified","icon","id","name","remark","sort","updateBy"]
    }

    UpdateBrand invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    UpdateBrand baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    UpdateBrand specialAssert(TestContext testContext){
        Map mysqlResult = MysqlService.updateBrand(testContext.get("id"))
        System.out.println(mysqlResult)
        assert testContext.get("id") == mysqlResult.get("id") as String
        assert testContext.get("icon") == mysqlResult.get("icon") as String
        assert testContext.get("name") == mysqlResult.get("name") as String
        assert testContext.get("remark") == mysqlResult.get("remark") as String
    }
}
