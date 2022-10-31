package com.meiji.test.http.mall.gift
import com.meiji.biz.request.http.mall.gift.GetTutorialList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetTutorialListTest extends BaseTest {
    GetTutorialList getTutorialList = new GetTutorialList()
    @Test(description = "送礼专区-教程列表  getTutorialList" ,groups = ["prod","uat"],testName = "",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getTutorialList(TestContext testContext){
        getTutorialList.invoke(testContext).baseAssert(testContext)
    }
}
