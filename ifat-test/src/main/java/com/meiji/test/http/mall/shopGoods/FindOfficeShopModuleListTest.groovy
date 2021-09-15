package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.FindOfficeShopModuleList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindOfficeShopModuleListTest extends BaseTest { //xml不需要传参，未创建xml文件
    FindOfficeShopModuleList findOfficeShopModuleList = new FindOfficeShopModuleList()
    @Test(description = "查询默认店铺首页模块列表 findOfficeShopModuleList" ,groups = ["prod","uat"],testName = "findOfficeShopModuleList1",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findOfficeShopModuleList(TestContext testContext){
        findOfficeShopModuleList.invoke(testContext).baseAssert(testContext)
    }
}
