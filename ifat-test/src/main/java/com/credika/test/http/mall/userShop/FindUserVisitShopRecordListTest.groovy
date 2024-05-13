package com.credika.test.http.mall.userShop

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.mall.userShop.FindUserVisitShopRecordList
import org.testng.annotations.Test

class FindUserVisitShopRecordListTest extends BaseTest {
    FindUserVisitShopRecordList findUserVisitShopRecordList = new FindUserVisitShopRecordList()
    @Test(description = "查询最近访问的店铺列表 findUserVisitShopRecordList" ,groups = ["prod","uat"],testName = "findUserVisitShopRecordList-mall",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findUserVisitShopRecordList(TestContext testContext){
        findUserVisitShopRecordList.invoke(testContext).baseAssert(testContext)
    }

//    @Test(description = "debug" ,groups = ["debug"],testName = "debug",
//            dataProvider = "common",dataProviderClass = TestData.class)
//    public void debug(TestContext testContext){
//        testContext.put("userId",12)
//        //testContext.put("id",12) 发现和id无关
//        findUserVisitShopRecordList.invoke(testContext).baseAssert(testContext)
//    }
}
