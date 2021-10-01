package com.meiji.test.http.platform.other


import com.meiji.biz.request.http.platform.other.ElectronicContract
import com.meiji.biz.request.http.platform.other.GoodsDetailManage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GoodsDetailManageTest extends BaseTest {//groupType要用数值类型，否则返回toatal为0
    GoodsDetailManage goodsDetailManage = new GoodsDetailManage()
    @Test(description = "商品白名单 goodsDetailManage" ,groups = ["prod","uat"],testName = "goodsDetailManage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodsDetailManage(TestContext testContext){
        testContext.put("groupType",0)
        testContext.put("pageNum","1")
        testContext.put("pageSize","20")
        testContext.put("searchTestGoods","1")
        goodsDetailManage.invoke(testContext).baseAssert(testContext)
    }
}
