package com.meiji.biz.request.http.platform.hfjy.orderManange
import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

import java.text.SimpleDateFormat

class Page extends PlatformPost{
    {
        super.api="/platform/oilsUseOrder/page"
        super.params = ["condition","page","rows"]
    }

    Page invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    Page preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    Page baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    Page specialAssert(TestContext testContext){
        ArrayList mysqlResult = MysqlService.page();
        ArrayList apiResult = testContext.getResponse().data.dataList
        println("mysqlResult:"+mysqlResult.get(0))
        println("apiResult:"+apiResult.get(0))
        println(apiResult.get(0).getAt("buyerInfo").getAt("oilTime"))
        println(mysqlResult.get(0).getAt("oil_time"))
        //assert mysqlResult.size() == apiResult.size()
        assert apiResult.get(0).getAt("id")==mysqlResult.get(0).getAt("id")
        assert apiResult.get(0).getAt("orderType")==mysqlResult.get(0).getAt("order_type")
        assert apiResult.get(0).getAt("orderCode")==mysqlResult.get(0).getAt("order_code")
        assert apiResult.get(0).getAt("buyerInfo").getAt("phone")==mysqlResult.get(0).getAt("buyer_phone")
        assert apiResult.get(0).getAt("oilDetail").getAt("oilPrice")==mysqlResult.get(0).getAt("oil_price")
        /*数据库时间格式转化*/
        String oil_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mysqlResult.get(0).getAt("oil_time"))
        assert apiResult.get(0).getAt("buyerInfo").getAt("oilTime")==oil_time
        return this
    }

}