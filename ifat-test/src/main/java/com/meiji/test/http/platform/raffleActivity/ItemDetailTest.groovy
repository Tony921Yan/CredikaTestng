package com.meiji.test.http.platform.raffleActivity
import com.meiji.biz.request.http.platform.raffleActivity.ItemDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ItemDetailTest extends BaseTest {
    ItemDetail itemDetail = new ItemDetail()
    @Test(description = "抽奖奖项详情 itemDetail" ,groups = ["prod","uat"],testName = "itemDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void itemDetail(TestContext testContext){
        itemDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}