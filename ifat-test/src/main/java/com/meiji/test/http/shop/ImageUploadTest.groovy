package com.meiji.test.http.shop

import com.meiji.com.BaseTest
import com.meiji.com.TestContext
import com.meiji.com.TestData
import com.meiji.request.http.shop.GetAfterLog
import com.meiji.request.http.shop.ImageUpload
import org.testng.annotations.Test

class ImageUploadTest extends BaseTest {
    ImageUpload imageUpload = new ImageUpload()
    @Test(description = "上传远程文件到微信 imageUpload" ,groups = ["prod","uat"],testName = "imageUpload",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void imageUpload(TestContext testContext){
        imageUpload.invoke(testContext).baseAssert(testContext).specialAssert(testContext)
    }
}
