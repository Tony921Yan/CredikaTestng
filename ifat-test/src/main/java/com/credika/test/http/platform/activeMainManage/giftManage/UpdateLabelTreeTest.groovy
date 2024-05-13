package com.credika.test.http.platform.activeMainManage.giftManage

import com.credika.biz.request.http.platform.activeMainManage.giftManage.GetLabelTree
import com.credika.biz.request.http.platform.activeMainManage.giftManage.UpdateLabelTree
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateLabelTreeTest extends BaseTest {
    UpdateLabelTree updateLabelTree = new UpdateLabelTree()
    GetLabelTree getLabelTree = new GetLabelTree()
    @Test(description = "送礼管理-编辑标签数据 updateLabelTree" ,groups = ["prod","uat"],testName = "updateLabelTree",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateLabelTree(TestContext testContext){
        getLabelTree.invoke(testContext).baseAssert(testContext).afterInvoke(testContext)
        updateLabelTree.invoke(testContext).baseAssert(testContext)
    }

}