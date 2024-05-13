package com.credika.test.http.mall.shopGoods

import com.credika.biz.request.http.mall.shopGoods.GetResourceWithCategory
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetResourceWithCategoryTest extends BaseTest {
    GetResourceWithCategory getResourceWithCategory = new GetResourceWithCategory()
    @Test(description = "搜索分类下资源位数据 getResourceWithCategory" ,groups = ["prod","uat"],testName = "getResourceWithCategory-c",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getResourceWithCategory(TestContext testContext){
        getResourceWithCategory.invoke(testContext).baseAssert(testContext)
    }
}
