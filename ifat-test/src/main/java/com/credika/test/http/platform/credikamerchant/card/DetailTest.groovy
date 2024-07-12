package com.credika.test.http.platform.credikamerchant.card
import com.credika.biz.request.http.platform.credikamerchant.crad.Detail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-20:20
 @version v2.1
 */
class DetailTest extends BaseTest {
     Detail detail = new Detail()
    @Test(description = "查询卡详情 detail" ,groups = ["prod","uat"],testName = "detail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void detail(TestContext testContext){
        detail.invoke(testContext).baseAssert(testContext)
    }

}
