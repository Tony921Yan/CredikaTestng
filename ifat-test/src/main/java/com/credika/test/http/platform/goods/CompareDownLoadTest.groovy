package com.credika.test.http.platform.goods

import com.credika.biz.request.http.platform.goods.CompareDownload
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test


class CompareDownLoadTest extends BaseTest {
    CompareDownload compareDownload = new CompareDownload()

    @Test(description = "比价日志文件下载 compareDownload" ,groups = ["prod","uat"],testName = "compareDownload2",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void compareDownload(TestContext testContext){
        compareDownload.invoke(testContext).baseAssert(testContext)


    }

}
