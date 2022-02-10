package com.meiji.biz.request.http.platform.member

import com.meiji.biz.request.http.platform.PlatformPost
import com.meiji.biz.service.MysqlService
import com.meiji.biz.util.DateUtil
import com.miyuan.ifat.support.test.TestContext

class FindUserIntegralInfo extends PlatformPost{
    {
        super.api="/Memeber/findUserIntegralInfo"
        super.params = ["condition","page","rows"]
    }

    FindUserIntegralInfo invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    FindUserIntegralInfo preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    FindUserIntegralInfo baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    FindUserIntegralInfo specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.dataList.getAt(0))
        Map mysqlResult = MysqlService.findUserIntegralInfo()
        System.out.println("mysqlResult"+mysqlResult)
        assert apiResult.total > 10
        assert mysqlResult.id == apiResult.dataList.getAt(0).getAt("id")
        assert mysqlResult.change_integral == apiResult.dataList.getAt(0).getAt("changeIntegral")
        assert mysqlResult.task_type == apiResult.dataList.getAt(0).getAt("taskType")
        assert DateUtil.strToDate(mysqlResult.gmt_create as String) == DateUtil.strToDate(apiResult.dataList.getAt(0).getAt("gmtCreate"))
    }

}
