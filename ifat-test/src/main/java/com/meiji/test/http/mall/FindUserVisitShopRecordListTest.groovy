package com.meiji.test.http.mall

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.mall.FindUserVisitShopRecordList
import org.testng.annotations.Test

class FindUserVisitShopRecordListTest extends BaseTest {
    FindUserVisitShopRecordList findUserVisitShopRecordList = new FindUserVisitShopRecordListTest()
    @Test(description = "查询最近访问的店铺列表 findUserVisitShopRecordList" ,groups = ["prod","uat"],testName = "findUserVisitShopRecordList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findUserVisitShopRecordList(TestContext testContext){
        findUserVisitShopRecordList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
