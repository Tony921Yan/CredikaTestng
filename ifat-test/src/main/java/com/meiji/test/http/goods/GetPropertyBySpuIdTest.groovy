package com.meiji.test.http.goods

import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import com.meiji.biz.request.http.goods.GetPropertyBySpuld
import org.testng.annotations.Test

class GetPropertyBySpuIdTest extends BaseTest {
    GetPropertyBySpuld getPropertyBySpuld = new GetPropertyBySpuld()
    @Test(description = "根据spuid获取属性 getPropertyBySpuId" ,groups = ["prod","uat"],testName = "getPropertyBySpuId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getPropertyBySpuld(TestContext testContext){
        getPropertyBySpuld.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "根据spuid获取属性-spuId不存在" ,groups = ["prod","uat"],testName = "getPropertyBySpuId_spuIdExits",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getPropertyBySpuld_spuIdExits(TestContext testContext){
        getPropertyBySpuld.invoke(testContext).baseAssert(testContext)
        assert testContext.getResponse().data.size()==0
    }


    @Test(description = "根据spuid获取属性 spuId为空" ,groups = ["prod","uat"],testName = "getPropertyBySpuId_spuIdNull",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getPropertyBySpuld_spuIdNull(TestContext testContext){
        getPropertyBySpuld.invoke(testContext)
        assert testContext.getResponse().code == "05008"
    }
}