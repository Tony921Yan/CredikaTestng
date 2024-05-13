package com.credika.test.http.platform.finance


import com.credika.biz.request.http.platform.finance.FundFlowPageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FundFlowPageQueryTest extends BaseTest {
    FundFlowPageQuery fundFlowPageQuery = new FundFlowPageQuery()
    @Test(description = "深圳市榴芒一刻食品有限公司--最新20条数据核对 fundFlowPageQuerySettlementFinish" ,groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuery(TestContext testContext){
        fundFlowPageQuery.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
    FundFlowPageQuery fundFlowPageQuerySettlementFinish = new FundFlowPageQuery()
    @Test(description = "广州猎尚信息科技有限公司--最新20条数据核对 fundFlowPageQuerySettlementFinish1",groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuerySettlementFinish(TestContext testContext){
        fundFlowPageQuerySettlementFinish.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
    @Test(description = "大埔县兴瑞现代农业发展有限公司--最新20条数据核对 fundFlowPageQuerySettlementFinish2",groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuerySettlementFinish2(TestContext testContext){
        fundFlowPageQuerySettlementFinish.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
    @Test(description = "云南山味集商贸有限公司--最新20条数据核对 fundFlowPageQuerySettlementFinish3",groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuerySettlementFinish3(TestContext testContext){
        fundFlowPageQuerySettlementFinish.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
    @Test(description = "广东邓老凉茶药业集团股份有限公司--最新20条数据核对 fundFlowPageQuerySettlementFinish4",groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish4",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuerySettlementFinish4(TestContext testContext){
        fundFlowPageQuerySettlementFinish.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
    @Test(description = "依山而立自用推荐--最新20条数据核对 fundFlowPageQuerySettlementFinish5",groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish5",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuerySettlementFinish5(TestContext testContext){
        fundFlowPageQuerySettlementFinish.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
    @Test(description = "流水禅生8657的小店--最新20条数据核对 fundFlowPageQuerySettlementFinish6",groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish6",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuerySettlementFinish6(TestContext testContext){
        fundFlowPageQuerySettlementFinish.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
    @Test(description = "启德的小店--最新20条数据核对 fundFlowPageQuerySettlementFinish7",groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuerySettlementFinish7(TestContext testContext){
        fundFlowPageQuerySettlementFinish.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
    @Test(description = "perry的心选小店铺--最新20条数据核对 fundFlowPageQuerySettlementFinish8",groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish8",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuerySettlementFinish8(TestContext testContext){
        fundFlowPageQuerySettlementFinish.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
    @Test(description = "栖霞春天E8928的小店--最新20条数据核对 fundFlowPageQuerySettlementFinish9",groups = ["prod","uat"],
            testName = "fundFlowPageQuerySettlementFinish9",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void fundFlowPageQuerySettlementFinish9(TestContext testContext){
        fundFlowPageQuerySettlementFinish.invoke(testContext).baseAssert(testContext)
        fundFlowPageQuerySettlementFinish.specialAssert(testContext)
    }
}
