package com.meiji.test.http.mall.orderInfo

import com.meiji.biz.request.http.mall.orderInfo.PreviewFreight
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/13 22:32
 @version v2.3
 */
class PreviewFreightTest extends BaseTest {
    PreviewFreight previewFreight = new PreviewFreight()
    @Test(description = "购物车预览运费 previewFreight" ,groups = ["prod","uat"],testName = "previewFreight",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void previewFreight(TestContext testContext){
        previewFreight.invoke(testContext).baseAssert(testContext)
    }
}
