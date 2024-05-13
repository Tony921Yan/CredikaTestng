package com.credika.test.http.platform.label

import com.credika.biz.request.http.platform.label.AddGoodsLabel
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test


class AddGoodsLabelTest extends BaseTest {
    AddGoodsLabel addGoodsLabel = new AddGoodsLabel()
    @Test(description = "添加商品标签 addGoodslabel" ,groups = ["prod","uat"],testName = "addGoodsLabel",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void addGoods(TestContext testContext){
        addGoodsLabel.invoke(testContext).baseAssert(testContext)
    }
}
