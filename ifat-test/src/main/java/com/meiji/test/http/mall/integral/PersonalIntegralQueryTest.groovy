package com.meiji.test.http.mall.integral
import com.meiji.biz.request.http.mall.integral.PersonalIntegralQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PersonalIntegralQueryTest extends BaseTest{
    PersonalIntegralQuery personalIntegralQuery = new PersonalIntegralQuery()
    @Test(description = "个人积分查询 personalIntegralQuery" ,groups = ["prod","uat"],testName = "personalIntegralQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void personalIntegralQuery(TestContext testContext){
        personalIntegralQuery.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
