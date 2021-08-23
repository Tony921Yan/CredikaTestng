package com.meiji.test.http.mall.userShop

import com.meiji.biz.request.http.mall.userShop.FindUserVisitShopRecordList
import com.meiji.biz.request.http.mall.userShop.UserVisitShop
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 *
 @author s1mple
 @create 2021/8/4-10:50
 */
class UserVisitShopTest extends BaseTest{
    UserVisitShop userVisitShop = new UserVisitShop()
    @Test(description = "查询最近访问的店铺列表 findUserVisitShopRecordList" ,groups = ["prod","uat"],testName = "findUserVisitShopRecordList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void userVisitShop(TestContext testContext){
        userVisitShop.invoke(testContext).baseAssert(testContext)
    }
}
