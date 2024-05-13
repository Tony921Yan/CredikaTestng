package com.credika.test.http.mall.pay

import com.credika.biz.request.http.mall.pay.IncomePageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class IncomePageQueryTest extends BaseTest {
    IncomePageQuery incomePageQuery = new IncomePageQuery()
    @Test(description = "总预估收益 incomePageQuery" ,groups = ["prod","uat"],testName = "incomePageQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void incomePageQuery(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",10)
        testContext.put("condition",'{"shopId":1405981112139808,"status":2}')
        incomePageQuery.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "累计已结算收益 incomePageQuery",groups = ["prod","uat"],testName = "incomePageQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void incomePageQuery1(TestContext testContext){
        testContext.put("page",1)
        testContext.put("rows",10)
        testContext.put("condition",'{"shopId":1405981112139808,"status":1}')
        incomePageQuery.invoke(testContext).baseAssert(testContext)
    }
}
