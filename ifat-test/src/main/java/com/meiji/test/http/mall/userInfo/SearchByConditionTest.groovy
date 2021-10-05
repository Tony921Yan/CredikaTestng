package com.meiji.test.http.mall.userInfo

import com.meiji.biz.request.http.mall.userInfo.GetCategoryListAndQrCode
import com.meiji.biz.request.http.mall.userInfo.SearchByCondition
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class SearchByConditionTest extends BaseTest {
    SearchByCondition searchByCondition = new SearchByCondition()
    @Test(description = "平台客服-常见问题 searchByCondition" ,groups = ["prod","uat"],testName = "searchByCondition",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void searchByCondition(TestContext testContext){
        testContext.put("categoryId",1)
        testContext.put("rows",20)
        searchByCondition.invoke(testContext).baseAssert(testContext)
    }
}
