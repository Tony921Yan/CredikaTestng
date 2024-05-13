package com.credika.biz.request.http.platform.brand

import com.credika.biz.request.http.platform.PlatformPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class CreateGoodPropertyGroup extends PlatformPost{
    {
        super.api = "AttrGroupManagement/createGoodPropertyGroup"
        super.params = ["categoryId","code","createBy","gmtCreate","id","list","name","remark"]
    }

    CreateGoodPropertyGroup invoke(TestContext testContext) {
        MysqlService.deleteGoodsPropertyGroup(testContext.get("name"))
        super.invoke(testContext)
        return this
    }

    CreateGoodPropertyGroup baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
}
