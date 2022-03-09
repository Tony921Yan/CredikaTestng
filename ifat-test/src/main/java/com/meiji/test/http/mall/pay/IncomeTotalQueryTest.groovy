package com.meiji.test.http.mall.pay


import com.meiji.biz.request.http.mall.pay.IncomeTotalQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class IncomeTotalQueryTest extends BaseTest {
    IncomeTotalQuery incomeTotalQuery = new IncomeTotalQuery()
    @Test(description = "今日收益 incomeTotalQuery" ,groups = ["prod","uat"],testName = "incomeTotalQuery-today",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void incomeTotalQuery(TestContext testContext){
        incomeTotalQuery.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "昨日收益 incomeTotalQuery-yesterday",groups = ["prod","uat"],testName = "incomeTotalQuery-yesterday",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void incomeTotalQuery1(TestContext testContext){
        incomeTotalQuery.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "本月收益 incomeTotalQuery-thisMonth",groups = ["prod","uat"],testName = "incomeTotalQuery-thisMonth",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void incomeTotalQuery2(TestContext testContext){
        incomeTotalQuery.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "上月收益 incomeTotalQuery-lastMonth",groups = ["prod","uat"],testName="incomeTotalQuery-lastMonth",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void incomeTotalQuery3(TestContext testContext){
        incomeTotalQuery.invoke(testContext).baseAssert(testContext)
    }
}
