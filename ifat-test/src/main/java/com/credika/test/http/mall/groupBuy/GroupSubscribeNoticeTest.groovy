package com.credika.test.http.mall.groupBuy
import com.credika.biz.request.http.mall.groupBuy.GetGroupBuyTopGoodsNew
import com.credika.biz.request.http.mall.groupBuy.GroupSubscribeNotice
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GroupSubscribeNoticeTest extends BaseTest {
    GroupSubscribeNotice groupSubscribeNotice = new GroupSubscribeNotice()
    GetGroupBuyTopGoodsNew getGroupBuyTopGoodsNew = new GetGroupBuyTopGoodsNew()
    @Test(description = "订阅拼团开始提醒 groupSubscribeNotice" ,groups = ["prod","uat"],testName = "groupSubscribeNoticeNew",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    void groupSubscribeNotice(TestContext testContext){
        getGroupBuyTopGoodsNew.invoke(testContext).baseAssert(testContext).afterinvoke(testContext)
        groupSubscribeNotice.invoke(testContext).baseAssert(testContext)
    }
}