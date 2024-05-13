package com.credika.test.http.mall.orderExhibit

import com.credika.biz.request.http.mall.orderExhibit.GetAllShowBonus
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy* @date 2022/01/06 22:38
 * @Vession V2.4
 */
class GetAllShowBonusTest extends BaseTest{
    GetAllShowBonus getAllShowBonus = new GetAllShowBonus()
    @Test(description = "查询晒单奖励（晒单有奖，晒单cps）getAllShowBonus",groups = ["prod","uat"],testName = "getAllShowBonus",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getAllShowBonus(TestContext testContext){
        getAllShowBonus.invoke(testContext).baseAssert(testContext)
    }
}
