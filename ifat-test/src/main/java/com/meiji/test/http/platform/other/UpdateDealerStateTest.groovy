package com.meiji.test.http.platform.other

import com.meiji.biz.request.http.platform.other.UpdateDealerState
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateDealerStateTest extends BaseTest {
    UpdateDealerState updateDealerState = new UpdateDealerState()
    @Test(description = "更新商家状态 updateDealerState" ,groups = ["prod","uat"],testName = "updateDealerState",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateDealerState(TestContext testContext){
        updateDealerState.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
