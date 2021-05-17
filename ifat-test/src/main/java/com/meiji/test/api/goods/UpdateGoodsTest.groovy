package com.meiji.test.api.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.brand.BrandDetail
import org.testng.annotations.Test

class UpdateGoodsTest extends BaseTest {
    BrandDetail brandDetail = new BrandDetail()
    @Test(description = "更新商品 updateGoods" ,groups = ["prod","uat"],testName = "brandDetail",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void brandDetail(TestContext testContext){
        brandDetail.invoke(testContext).baseAssert(testContext)
    }
}
