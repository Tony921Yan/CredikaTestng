package com.meiji.biz.request.http.OMS.template

import com.meiji.biz.request.http.OMS.OMSPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

class FreightTemplateQueryPage extends OMSPost {
    {
        super.api = "freightTemplate/queryPage"
        super.params =  [ "supplierId","page","limit","templateCode","templateName"]
    }

    FreightTemplateQueryPage invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FreightTemplateQueryPage preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FreightTemplateQueryPage baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    FreightTemplateQueryPage specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        Map mysqlResult = MysqlService.FreightTemplateQueryPage()
        System.out.println("mysqlResult" + mysqlResult)
        System.out.println("apiResult" + apiResult)
        System.out.println("apiResult" + apiResult.templateList.getAt(1).getAt("templateCode"))
        assert apiResult.total > 20
        assert mysqlResult.template_code == apiResult.templateList.getAt(1).getAt("templateCode")
        assert mysqlResult.id == apiResult.templateList.getAt(1).getAt("id")
    }
}
