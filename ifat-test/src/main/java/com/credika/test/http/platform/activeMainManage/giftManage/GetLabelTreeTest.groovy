package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.GetLabelTree
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class GetLabelTreeTest extends BaseTest {
    GetLabelTree getLabelTree = new GetLabelTree()
    @Test(description = "送礼管理-分类管理-获取标签数据 getLabelTree" ,groups = ["prod","uat"],testName = "getLabelTree",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void getLabelTree(TestContext testContext){
        getLabelTree.invoke(testContext).baseAssert(testContext)
    }

}