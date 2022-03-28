package com.meiji.test.http.platform.shopmanager
import com.meiji.biz.request.http.platform.shopmanager.FindShopDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindShopDetailTest extends BaseTest {
    FindShopDetail findShopDetail = new FindShopDetail()
    @Test(description = "查询店铺详情 findShopDetail" ,groups = ["prod","uat"],testName = "findShopDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findShopDetail(TestContext testContext){
        findShopDetail.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
