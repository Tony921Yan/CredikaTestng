package com.meiji.test.http.OMS.goods

import com.meiji.biz.request.http.OMS.goods.GetFreightTemplateInfo
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetFreightTemplateInfoTest extends BaseTest {
    GetFreightTemplateInfo getFreightTemplateInfo = new GetFreightTemplateInfo()
    @Test(description = "商品详情-运费模板 getFreightTemplateInfo" ,groups = ["prod","uat"],testName = "getFreightTemplateInfo",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void getFreightTemplateInfo(TestContext testContext){
        getFreightTemplateInfo.invoke(testContext).baseAssert(testContext)
    }
}

