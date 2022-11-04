package com.meiji.test.http.platform.channel
import com.meiji.biz.request.http.platform.channel.UpdateBatchSort
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class UpdateBatchSortTest extends BaseTest {
    UpdateBatchSort updateBatchSort = new UpdateBatchSort()
    @Test(description = "批量更新排序-拖动排序 updateBatchSort" ,groups = ["prod","uat"],testName = "updateBatchSort",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void updateBatchSort(TestContext testContext){
        testContext.put("columnId", MysqlService.searchBuyerShow())
        updateBatchSort.invoke(testContext).baseAssert(testContext)
    }
}
