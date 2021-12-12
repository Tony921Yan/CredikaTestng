package com.meiji.test.http.platform.category

import com.meiji.biz.request.http.platform.category.QuerySecondLevelCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test
/**
 *
 @author Remy
 @create 2021/12/12 22:32
 @version v2.3
 */
class QuerySecondLevelCategoryTest extends BaseTest {
    QuerySecondLevelCategory querySecondLevelCategory =new QuerySecondLevelCategory();
    @Test(description = "美粉圈二级分类 querySecondLevelCategory" ,groups = ["prod","uat"],testName = "querySecondLevelCategory",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)//未创建xml文件
    public void querySecondLevelCategory(TestContext testContext){
        querySecondLevelCategory.invoke(testContext).baseAssert(testContext)
    }
}
