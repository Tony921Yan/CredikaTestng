package com.credika.test.http.shop.module


import com.credika.biz.request.http.mall.shopGoods.FindOfficeShopModuleList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindOfficeShopModuleListTest extends BaseTest {
    FindOfficeShopModuleList findOfficeShopModuleList = new FindOfficeShopModuleList()
    @Test(description = "查询默认店铺首页模块列表 findOfficeShopModuleList" ,groups = ["prod","uat"],testName = "findOfficeShopModuleList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findOfficeShopModuleList(TestContext testContext){
        findOfficeShopModuleList.invoke(testContext).baseAssert(testContext)
    }
}
