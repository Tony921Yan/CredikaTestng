package com.meiji.test.http.mall.groupBuy
import com.meiji.biz.request.http.mall.groupBuy.GetGroupBuyTopGoods
import com.meiji.biz.request.http.mall.groupBuy.GroupSubscribeNotice
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GroupSubscribeNoticeTest extends BaseTest {
    GroupSubscribeNotice groupSubscribeNotice = new GroupSubscribeNotice()
    GetGroupBuyTopGoods getGroupBuyTopGoods = new GetGroupBuyTopGoods()
    @Test(description = "订阅拼团开始提醒 groupSubscribeNotice" ,groups = ["prod","uat"],testName = "groupSubscribeNotice",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void groupSubscribeNotice(TestContext testContext){
        getGroupBuyTopGoods.invoke(testContext).baseAssert(testContext).afterinvoke(testContext)
        groupSubscribeNotice.invoke(testContext).baseAssert(testContext)
    }
}