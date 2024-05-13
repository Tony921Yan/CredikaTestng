package com.credika.test.http.platform.goods


import com.credika.biz.request.http.platform.goods.GoodsCopy
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test


class GoodsCopyTest extends BaseTest {
    GoodsCopy goodsCopy = new GoodsCopy()
    @Test(description = "复制商品 goodsCopy" ,groups = ["prod","uat"],testName = "goodsCopy",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void goodsCopy(TestContext testContext){
        testContext.put("spuId","1425511242792992")
        goodsCopy.invoke(testContext).baseAssert(testContext)
    }
}
