package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.GetSpuBuyerShow
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author Remy
 @create 2021/11/18-13:50
 @version v2.1
 */
class GetSpuBuyerShowTest extends BaseTest{
    GetSpuBuyerShow getSpuBuyerShow = new GetSpuBuyerShow()
    @Test(description = "查询精选晒单 getSpuBuyerShow" ,groups = ["prod","uat"],testName = "getSpuBuyerShow",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getSpuBuyerShow(TestContext testContext){
        getSpuBuyerShow.invoke(testContext).baseAssert(testContext)
    }
}
