package com.credika.test.http.mall.integral

import com.credika.biz.request.http.mall.integral.CuponIntegralRuleQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class CuponIntegralRuleQueryTest extends BaseTest{
    CuponIntegralRuleQuery cuponIntegralRuleQuery = new CuponIntegralRuleQuery()
    @Test(description = "积分兑券规则查询 cuponIntegralRuleQuery" ,groups = ["prod","uat"],testName = "cuponIntegralRuleQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void cuponIntegralRuleQuery(TestContext testContext){
        cuponIntegralRuleQuery.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
