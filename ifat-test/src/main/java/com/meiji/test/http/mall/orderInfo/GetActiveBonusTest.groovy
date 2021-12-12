package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.GetActiveBonus
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class GetActiveBonusTest extends BaseTest {
    GetActiveBonus getActiveBonus = new GetActiveBonus()
    @Test(description = "查询当前进行中的晒单活动 getActiveBonus" ,groups = ["prod","uat"],testName = "getActiveBonus",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)//无xml文档
    public void getActiveBonus(TestContext testContext){
        getActiveBonus.invoke(testContext).baseAssert(testContext)
    }
}
