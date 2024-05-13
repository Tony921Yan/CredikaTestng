package com.credika.test.http.shop.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.credika.biz.request.http.shop.goods.FindGoodsCategoryTree
import org.testng.annotations.Test

class FindGoodsCategoryTreeTest extends BaseTest {
    FindGoodsCategoryTree findGoodsCategoryTree = new FindGoodsCategoryTree()
    @Test(description = "查询选品分类树 findGoodsCategoryTree" ,groups = ["prod","uat"],testName = "findGoodsCategoryTree",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findGoodsCategoryTree(TestContext testContext){
        findGoodsCategoryTree.invoke(testContext).baseAssert(testContext)
    }
}
