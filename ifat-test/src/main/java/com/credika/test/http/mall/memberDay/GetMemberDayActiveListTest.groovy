package com.credika.test.http.mall.memberDay
import com.credika.biz.request.http.mall.memberDay.GetMemberDayActiveList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetMemberDayActiveListTest extends BaseTest {
    GetMemberDayActiveList getMemberDayActiveList = new GetMemberDayActiveList()
    @Test(description = "获取会员日落地页第一页数据 getMemberDayActiveList" ,groups = ["prod","uat"],testName = "getMemberDayActiveList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getMemberDayActiveList(TestContext testContext){
        getMemberDayActiveList.invoke(testContext).baseAssert(testContext)
    }
}
