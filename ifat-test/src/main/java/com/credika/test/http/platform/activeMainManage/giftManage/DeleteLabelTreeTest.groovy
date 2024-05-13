package com.credika.test.http.platform.activeMainManage.giftManage
import com.credika.biz.request.http.platform.activeMainManage.giftManage.DeleteLabelTree
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class DeleteLabelTreeTest extends BaseTest {
    DeleteLabelTree deleteLabelTree = new DeleteLabelTree()
    @Test(description = "送礼管理-删除送礼标签 deleteLabelTree" ,groups = ["prod","uat"],testName = "deleteLabelTree",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void deleteLabelTree(TestContext testContext){
        ArrayList<Long> list = MysqlService.deleteLabelTree()
        testContext.put("list",list )
        deleteLabelTree.invoke(testContext).baseAssert(testContext)
    }

}