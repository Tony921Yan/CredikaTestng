package com.meiji.test.http.mall.content

import com.meiji.biz.request.http.mall.content.GetBuyerShowDetailById
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy* @date 2022/01/06 22:38
 * @Vession V2.4
 */
class GetBuyerShowDetailByIdTest extends BaseTest{
    GetBuyerShowDetailById getBuyerShowDetailById = new GetBuyerShowDetailById()
    @Test(description = "查询晒单 getBuyerShowDetailById",groups = ["prod","uat"],testName = "getBuyerShowDetailById",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getBuyerShowDetailById(TestContext testContext){
        getBuyerShowDetailById.invoke(testContext).baseAssert(testContext)
    }
}
