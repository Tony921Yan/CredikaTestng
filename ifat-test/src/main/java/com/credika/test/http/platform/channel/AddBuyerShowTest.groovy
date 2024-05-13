package com.credika.test.http.platform.channel
import com.credika.biz.request.http.platform.channel.AddBuyerShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddBuyerShowTest extends BaseTest {
    AddBuyerShow addBuyerShow = new AddBuyerShow()
    @Test(description = "添加晒单(溯源) addBuyerShow" ,groups = ["prod","uat"],testName = "addBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addBuyerShow(TestContext testContext){
        addBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}
