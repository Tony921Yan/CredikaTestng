package com.meiji.test.http.platform.other


import com.meiji.biz.request.http.platform.other.ElectronicContract
import com.meiji.biz.request.http.platform.other.GoodsDetailManage
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GoodsDetailManageTest extends BaseTest {//返回toatal为0
    GoodsDetailManage goodsDetailManage = new GoodsDetailManage()
    @Test(description = "商品白名单 goodsDetailManage" ,groups = ["prod","uat"],testName = "goodsDetailManage",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodsDetailManage(TestContext testContext){
        goodsDetailManage.invoke(testContext).baseAssert(testContext)
    }
}
