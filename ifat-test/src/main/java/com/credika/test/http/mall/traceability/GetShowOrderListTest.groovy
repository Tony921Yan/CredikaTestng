package com.credika.test.http.mall.traceability


import com.credika.biz.request.http.mall.traceability.GetShowOrderList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 * @author Remy
 * * @date 2022/11/08
 * @Vession V3.5
 * */
class GetShowOrderListTest extends BaseTest {
    GetShowOrderList getShowOrderList = new GetShowOrderList()
    @Test(description = "溯源广场列表数据-全部 getShowOrderList" ,groups = ["prod","uat"],testName = "getShowOrderList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getShowOrderList(TestContext testContext){
        getShowOrderList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "溯源广场列表数据-翻页 getShowOrderList" ,groups = ["prod","uat"],testName = "getShowOrderList1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getShowOrderList1(TestContext testContext){
        getShowOrderList.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "溯源广场列表数据-第二个分类 getShowOrderList" ,groups = ["prod","uat"],testName = "getShowOrderList2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getShowOrderList2(TestContext testContext){
        Long test = 1510356102938687 //从数据库拿,后续优化
//        String condition = "{"+"columnId"+":"+ test +"}"
        testContext.put("condition",testContext.put("columnId",test))
        testContext.put("page",1)
        testContext.put("rows",20)
        getShowOrderList.invoke(testContext).baseAssert(testContext)
    }
}