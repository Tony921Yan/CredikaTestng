package com.meiji.biz.request.http.platform.integral
import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class GetIntegralList extends PlatformPost{
    {
        super.api="/IntegralList/getIntegralList"
        super.params = ["condition","userId","page","rows"]
    }

    GetIntegralList invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    GetIntegralList preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    GetIntegralList baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetIntegralList specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.dataList.getAt(0).get("changeIntegral"))
        Map mysqlResult = MysqlService.getIntegralList()
        System.out.print("mysqlResult"+mysqlResult)
        assert apiResult.total > 20
        assert mysqlResult.change_integral == apiResult.dataList.getAt(0).get("changeIntegral")
        assert mysqlResult.pre_update_integral == apiResult.dataList.getAt(0).get("preUpdateIntegral")
//        assert mysqlResult.after_update_integral == apiResult.dataList.getAt(0).get("afterUpdateIntegral")//        assert DateUtil.strToDate(mysqlResult.gmt_modified as String) == DateUtil.strToDate(apiResult.dataList.getAt(0).getAt("gmtModified"))
        return this
    }

}