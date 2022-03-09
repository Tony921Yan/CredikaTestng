package com.meiji.test.http.mall.userShop

import com.meiji.biz.request.http.mall.userShop.FindActiveGoods
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
class FindActiveGoodsTest extends BaseTest{
    FindActiveGoods findActiveGoods = new FindActiveGoods()
    @Test(description = "查询活动商品 findActiveGoods" ,groups = ["prod","uat"],testName = "findActiveGoods",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findActiveGoods(TestContext testContext){
        findActiveGoods.invoke(testContext).baseAssert(testContext)
    }

}
