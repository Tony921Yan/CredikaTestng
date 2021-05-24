package com.meiji.test.http.platform.goods


import com.meiji.biz.request.http.platform.goods.PublishBack
import com.meiji.biz.request.http.platform.goods.PublishGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class PublishGoodsTest extends BaseTest {//status由3变为4
    PublishGoods publishGoods = new PublishGoods()
    @Test(description = "发布商品 publishGoods" ,groups = ["prod","uat"],testName = "publishGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void publishGoods(TestContext testContext){
        publishGoods.invoke(testContext).baseAssert(testContext)
    }
}
