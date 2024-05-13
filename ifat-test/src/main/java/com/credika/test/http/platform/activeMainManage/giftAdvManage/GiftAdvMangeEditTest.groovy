package com.credika.test.http.platform.activeMainManage.giftAdvManage

import com.credika.biz.request.http.platform.activeMainManage.giftAdvManage.GiftAdvManageEdit
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GiftAdvMangeEditTest extends BaseTest {
    GiftAdvManageEdit giftAdvManageEdit = new GiftAdvManageEdit()
    @Test(description = "营销管理-送礼管理-广告位管理-编辑 giftAdvManageEdit" ,groups = ["prod","uat"],testName = "giftAdvManageEdit",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void giftAdvManageEdit(TestContext testContext){  //不能发生产
        testContext.get("id",1)
        testContext.get("pic","https://static.meiji8888.com/front/mj-ecmiddle-sys/upload/8b52630e320c9fce6d2e63c0252e704d.png")
        testContext.get("target","1502713961513023")
        testContext.get("targetActiveType",11)
        testContext.get("targetType",6)
        giftAdvManageEdit.invoke(testContext).baseAssert(testContext)
    }

    @Test(description = "营销管理-送礼管理-广告位管理-送礼专区页-资源位1-编辑 giftAdvManageEdit" ,groups = ["prod","uat"],testName = "giftAdvManageEdit",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void giftAdvManageEdit1(TestContext testContext){  //不能发生产
        testContext.get("id",5)
        testContext.get("pic","https://static.meiji8888.com/front/mj-ecmiddle-sys/upload/25f1cbb703f6dbd450224f6b759ab876.png")
        testContext.get("target",41)
        testContext.get("targetActiveType","")
        testContext.get("targetType",19)
        giftAdvManageEdit.invoke(testContext).baseAssert(testContext)
    }
}