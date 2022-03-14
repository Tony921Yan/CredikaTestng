package com.meiji.biz.request.http.platform.brand

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class CreateGoodProperty extends PlatformPost{
    {
        super.api = "AttrManagement/createGoodProperty"
        super.params = ["createBy","gmtCreate","goodPropertyValues","id","isMust",
                         "isSearch","name","remark","status","type","updateBy"]
    }

    CreateGoodProperty invoke(TestContext testContext) {
        System.out.println(testContext.get("name"))
        MysqlService.deleteGoodsProperty(testContext.get("name"))
        super.invoke(testContext)
        return this
    }

    CreateGoodProperty preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    CreateGoodProperty baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    CreateGoodProperty specialAssert(TestContext testContext){
        super.specialAssert(testContext)
        return this
    }

}
