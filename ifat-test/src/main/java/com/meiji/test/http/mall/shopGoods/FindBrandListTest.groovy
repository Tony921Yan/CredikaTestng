package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.FindBrandList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindBrandListTest extends BaseTest {
    FindBrandList findBrandList = new FindBrandList()
    @Test(description = "查询品牌列表 findBrandList" ,groups = ["prod","uat"],testName = "findBrandList-mall",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findBrandList(TestContext testContext){
        findBrandList.invoke(testContext).baseAssert(testContext)
    }
}
