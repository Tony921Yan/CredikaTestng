package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.GetBuyerShowLabelList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy*
 * @date 2022/02/07 10:43
 * @Vession V2.5
 */
class GetBuyerShowLabelListTest extends BaseTest{
    GetBuyerShowLabelList getBuyerShowLabelList = new GetBuyerShowLabelList()
    @Test(description = "获取商品晒单文案 getBuyerShowLabelList",groups = ["uat","prod"],testName = "getBuyerShowLabelList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getBuyerShowLabelList(TestContext testContext){
        getBuyerShowLabelList.invoke(testContext).baseAssert(testContext)
    }
}
