package com.meiji.test.http.mall.integral
import com.meiji.biz.request.http.mall.integral.PageQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PageQueryTest extends BaseTest{
    PageQuery pageQuery = new PageQuery()
    @Test(description = "积分明细分页查询 pageQuery" ,groups = ["prod","uat"],testName = "pageQuery",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getChannelData(TestContext testContext){
        pageQuery.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
