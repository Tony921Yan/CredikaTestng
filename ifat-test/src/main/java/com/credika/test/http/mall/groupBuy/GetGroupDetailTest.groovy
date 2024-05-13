package com.credika.test.http.mall.groupBuy
import com.credika.biz.request.http.mall.groupBuy.GetGroupDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGroupDetailTest extends BaseTest {
    GetGroupDetail getGroupDetail = new GetGroupDetail()
    @Test(description = "拼团详情 getGroupDetail" ,groups = ["prod","uat"],testName = "getGroupDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGroupDetail(TestContext testContext){
        getGroupDetail.invoke(testContext).baseAssert(testContext)
    }
}