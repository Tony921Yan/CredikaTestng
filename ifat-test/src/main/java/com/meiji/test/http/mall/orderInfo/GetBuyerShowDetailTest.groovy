package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.GetBuyerShowDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/16 22:32
 @version v2.3
 */
class GetBuyerShowDetailTest extends BaseTest {
    GetBuyerShowDetail getBuyerShowDetail = new GetBuyerShowDetail()
    @Test(description = "去晒物 getBuyerShowDetail" ,groups = ["prod","uat"],testName = "getBuyerShowDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getBuyerShowDetail(TestContext testContext){
        getBuyerShowDetail.invoke(testContext).baseAssert(testContext)
    }
}
