package com.credika.test.http.platform.goods

import com.credika.biz.request.http.platform.goods.GoodsLabelListQueryPage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GoodsLabelListQueryPageTest extends BaseTest {
    GoodsLabelListQueryPage goodsLabelListQueryPage = new GoodsLabelListQueryPage()
    @Test(description = "商品查询列表-商品详情 goodsLabelListQueryPage", groups = ["prod", "uat"], testName = "goodsLabelListQueryPage",
            dataProvider = "dataProvider", dataProviderClass = TestData.class)
    public void assetsManagement(TestContext testContext) {
        goodsLabelListQueryPage.invoke(testContext).baseAssert(testContext)
    }
}