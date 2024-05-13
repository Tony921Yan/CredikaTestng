package com.credika.biz.request.http.platform.brand

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class CreateBrand extends PlatformPost{
    {
        super.api="BrandManage/createBrand"
        super.params = ["createBy","gmtCreate","gmtModified","icon","id","name","remark","sort","updateBy"]
    }

    CreateBrand invoke(TestContext testContext) {
        MysqlService.deleteBrand(testContext.get("name"))
        super.invoke(testContext)
        return this
    }

    CreateBrand preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CreateBrand baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    CreateBrand specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }

}
