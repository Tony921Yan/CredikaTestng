package com.credika.test.http.mall.shopGoods

import com.credika.biz.request.http.mall.shopGoods.GetGoodsLabel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetGoodsLabelTest extends BaseTest { //不确定是否还在使用
    GetGoodsLabel getGoodsLabel = new GetGoodsLabel()
    @Test(description = "获取商品标签 getGoodsLabel" ,groups = ["prod","uat"],testName = "getGoodsLabel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getGoodsLabel(TestContext testContext){
        getGoodsLabel.invoke(testContext).baseAssert(testContext)
    }
}
