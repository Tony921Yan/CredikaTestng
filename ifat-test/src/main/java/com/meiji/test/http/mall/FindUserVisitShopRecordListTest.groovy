package com.meiji.test.http.mall

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.mall.FindUserVisitShopRecordList
import org.testng.annotations.Test

class FindUserVisitShopRecordListTest extends BaseTest {
    FindUserVisitShopRecordList findUserVisitShopRecordList = new FindUserVisitShopRecordListTest()
    @Test(description = "查询最近访问的店铺列表 findUserVisitShopRecordList" ,groups = ["prod","uat"],testName = "findUserVisitShopRecordList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findUserVisitShopRecordList(TestContext testContext){
        findUserVisitShopRecordList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
