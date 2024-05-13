package com.credika.test.http.platform.grantCouponActive
import com.credika.biz.request.http.platform.integral.List
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ListTest extends BaseTest {
    List list = new List()
    @Test(description = "选择优惠券 list" ,groups = ["prod","uat"],testName = "list",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void list(TestContext testContext){
        list.invoke(testContext).baseAssert(testContext)
    }
}