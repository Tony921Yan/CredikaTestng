package com.credika.test.http.platform.shopManager


import com.credika.biz.request.http.platform.shopmanager.FindInviteCodePageByShopId
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class FindInviteCodePageByShopIdTest extends BaseTest {
    FindInviteCodePageByShopId findInviteCodePageByShopId = new FindInviteCodePageByShopId()
    @Test(description = "通过店铺ID查询邀请码兑换记录 findInviteCodePageByShopId" ,groups = ["prod","uat"],testName = "findInviteCodePageByShopId",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void findInviteCodePageByShopId(TestContext testContext){
        findInviteCodePageByShopId.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
