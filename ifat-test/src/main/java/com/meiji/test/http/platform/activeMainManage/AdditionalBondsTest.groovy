package com.meiji.test.http.platform.activeMainManage

import com.meiji.biz.request.http.platform.activeMainManage.AdditionalBonds
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AdditionalBondsTest extends BaseTest {
    AdditionalBonds additionalBonds = new AdditionalBonds()
    @Test(description = "管理活动-增发券 additionalBonds" ,groups = ["prod","uat"],testName = "additionalBonds",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void additionalBonds(TestContext testContext){
        additionalBonds.invoke(testContext).baseAssert(testContext)
    }

}