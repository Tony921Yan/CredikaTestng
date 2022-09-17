package com.meiji.test.http.mall.shopGoods

import com.meiji.biz.request.http.mall.shopGoods.GetVirtualBarrageList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetVirtualBarrageListTest extends BaseTest {
    GetVirtualBarrageList getVirtualBarrageList = new GetVirtualBarrageList()
    @Test(description = "商品详情-获取虚拟商品弹幕 getVirtualBarrageList" ,groups = ["prod","uat"],testName = "getVirtualBarrageList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getVirtualBarrageList(TestContext testContext){
        getVirtualBarrageList.invoke(testContext).baseAssert(testContext)
    }
}
