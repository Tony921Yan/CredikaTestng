package com.meiji.test.http.OMS.goods

import com.meiji.biz.request.http.OMS.goods.GuideDetail
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GuideDetailTest extends BaseTest {
    GuideDetail guideDetail = new GuideDetail()
    @Test(description = "下载指引-商品 guideDetail" ,groups = ["prod","uat"],testName = "guideDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void guideDetail(TestContext testContext){
        guideDetail.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "下载指引-订单管理 guideDetail" ,groups = ["prod","uat"],testName = "guideDetail1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void guideDetail1(TestContext testContext){
        guideDetail.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "下载指引-售后单管理 guideDetail" ,groups = ["prod","uat"],testName = "guideDetail2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void guideDetail2(TestContext testContext){
        guideDetail.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "下载指引-运费模板 guideDetail" ,groups = ["prod","uat"],testName = "guideDetail7",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void guideDetail7(TestContext testContext){
        guideDetail.invoke(testContext).baseAssert(testContext)
    }
}

