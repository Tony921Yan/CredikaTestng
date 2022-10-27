package com.meiji.test.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.activeMainManage.giftManage.AddLabelTree
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class AddLabelTreeTest extends BaseTest {
    AddLabelTree addLabelTree = new AddLabelTree()
    @Test(description = "送礼管理-新增送礼标签 addLabelTree" ,groups = ["prod","uat"],testName = "addLabelTree",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void addLabelTree(TestContext testContext){
        addLabelTree.invoke(testContext).baseAssert(testContext)
    }

}