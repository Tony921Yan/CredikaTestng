package com.credika.test.http.mall.traceability

import com.credika.biz.request.http.mall.traceability.GetCategoryList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

/**
 * @author Remy
 * * @date 2022/11/08
 * @Vession V3.5
 * */
class GetCategoryListTest extends BaseTest {
    GetCategoryList getCategoryList = new GetCategoryList()
    @Test(description = "溯源广场栏目 getCategoryList" ,groups = ["prod","uat"],testName = "getCategoryList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getCategoryList(TestContext testContext){
        getCategoryList.invoke(testContext).baseAssert(testContext)
    }
}