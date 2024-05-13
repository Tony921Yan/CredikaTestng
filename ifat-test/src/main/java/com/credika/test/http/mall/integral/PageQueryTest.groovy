package com.credika.test.http.mall.integral
import com.credika.biz.request.http.mall.integral.PageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageQueryTest extends BaseTest{
    PageQuery pageQuery = new PageQuery()
    @Test(description = "积分明细分页查询-所有记录 pageQuery1" ,groups = ["prod","uat"],testName = "pageQuery1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageQuery1(TestContext testContext){
        pageQuery.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

    @Test(description = "积分明细分页查询-获取记录 pageQuery2" ,groups = ["prod","uat"],testName = "pageQuery2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageQuery2(TestContext testContext){
        pageQuery.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "积分明细页查询-消耗记录 pageQuery3,",groups = ["prod","uat"],testName = "pageQuery3",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void pageQuery3(TestContext testContext){
        pageQuery.invoke(testContext).baseAssert(testContext)
    }
}
