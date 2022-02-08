package com.meiji.biz.request.http.mall.integral
import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext
import org.junit.Assert

class PersonalIntegralQuery extends MallPost{
    {
        super.api = "integral/personalIntegralQuery"
        super.params=["userId"]
    }

    PersonalIntegralQuery invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    PersonalIntegralQuery baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    PersonalIntegralQuery specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        System.out.println("apiResult"+apiResult.integral)
        Map mysqlResult = MysqlService.personalIntegralQuery(testContext.get("userId")).get(0)
        System.out.println("mysqlResult"+mysqlResult)
        assert mysqlResult.integral == apiResult.integral
        return this
    }
}
