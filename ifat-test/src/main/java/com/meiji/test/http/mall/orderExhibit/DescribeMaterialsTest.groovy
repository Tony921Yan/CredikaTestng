package com.meiji.test.http.mall.orderExhibit

import com.meiji.biz.request.http.mall.orderExhibit.DescribeMaterials
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/07 10:57
 * @Vession V2.5
 */
class DescribeMaterialsTest extends BaseTest{
    DescribeMaterials describeMaterials = new DescribeMaterials()
    @Test(description = "获取媒体详情 describeMaterials",groups = ["uat","prod"],testName = "describeMaterials",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void describeMaterials(TestContext testContext){
        describeMaterials.invoke(testContext).baseAssert(testContext)
    }

}
