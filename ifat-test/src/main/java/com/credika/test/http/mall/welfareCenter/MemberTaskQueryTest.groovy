package com.credika.test.http.mall.welfareCenter
import com.credika.biz.request.http.mall.welfareCenter.MemberTaskQuery
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class MemberTaskQueryTest extends BaseTest {
    MemberTaskQuery memberTaskQuery = new MemberTaskQuery()
    @Test(description = "福利中心-会员任务查询 memberTaskQuery" ,groups = ["prod","uat"],testName = "",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void memberTaskQuery(TestContext testContext){
        memberTaskQuery.invoke(testContext).baseAssert(testContext)
    }
}
