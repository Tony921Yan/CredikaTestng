package com.meiji.test.http.shop


import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ImageUploadTest extends BaseTest {
    com.meiji.biz.request.http.shop.ImageUpload imageUpload = new com.meiji.biz.request.http.shop.ImageUpload()
    @Test(description = "上传远程文件到微信 imageUpload" ,groups = ["prod","uat"],testName = "imageUpload",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void imageUpload(TestContext testContext){
        imageUpload.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
