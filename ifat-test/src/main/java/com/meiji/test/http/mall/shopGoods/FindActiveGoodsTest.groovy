package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.FindActiveGoods
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindActiveGoodsTest extends BaseTest {
    FindActiveGoods findActiveGoods = new FindActiveGoods()
    @Test(description = "查询活动商品列表 findActiveGoods" ,groups = ["prod","uat"],testName = "findActiveGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findActiveGoods(TestContext testContext){
        findActiveGoods.invoke(testContext).baseAssert(testContext)
    }
}
