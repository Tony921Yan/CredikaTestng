package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.FindGoodsCategoryTree
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindGoodsCategoryTreeTest extends BaseTest {
    FindGoodsCategoryTree findGoodsCategoryTree = new FindGoodsCategoryTree()
    @Test(description = "查询店铺分类树列表 findGoodsCategoryTree" ,groups = ["prod","uat"],testName = "findGoodsCategoryTree1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findGoodsCategoryTree(TestContext testContext){
        findGoodsCategoryTree.invoke(testContext).baseAssert(testContext)
    }
}
