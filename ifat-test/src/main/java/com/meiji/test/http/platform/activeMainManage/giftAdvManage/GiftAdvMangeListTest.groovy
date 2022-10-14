package com.meiji.test.http.platform.activeMainManage.giftAdvManage

import com.meiji.biz.request.http.platform.activeMainManage.giftAdvManage.GiftAdvManageList
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GiftAdvMangeListTest extends BaseTest {
    GiftAdvManageList giftAdvManageList = new GiftAdvManageList()
    @Test(description = "营销管理-送礼管理-广告位管理 giftAdvManageList" ,groups = ["prod","uat"],testName = "giftAdvManageList",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void activeMainManageAdd(TestContext testContext){
        giftAdvManageList.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }

}