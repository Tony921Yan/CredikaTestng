package com.meiji.test.http.mall.material

import com.meiji.biz.request.http.mall.material.GetShowBonus
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/13 09:17
 @version v2.3
 */
class GetShowBonusTest extends BaseTest {
    GetShowBonus getShowBonus = new GetShowBonus()
    @Test(description = "查询晒单有奖 getShowBonus" ,groups = ["prod","uat"],testName = "getShowBonus",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getShowBonus(TestContext testContext){
        getShowBonus.invoke(testContext).baseAssert(testContext)
    }
}
