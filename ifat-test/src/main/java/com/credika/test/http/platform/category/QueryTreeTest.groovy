package com.credika.test.http.platform.category

import com.credika.biz.request.http.platform.category.QueryTree
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
class QueryTreeTest extends BaseTest {
    QueryTree queryTree = new QueryTree()
    @Test(description = "类目管理 queryTree" ,groups = ["prod","uat"],testName = "queryTree",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void queryTree(TestContext testContext){
        queryTree.invoke(testContext).baseAssert(testContext)
    }
}
