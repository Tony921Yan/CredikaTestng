package com.credika.test.http.shop.shopinfo

import com.credika.biz.request.http.shop.shopinfo.ImageUpload
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.test.TestData
import org.testng.annotations.Test

class ImageUploadTest extends BaseTest {
    ImageUpload imageUpload = new ImageUpload()
    @Test(description = "上传远程文件到微信 imageUpload" ,groups = ["prod","uat"],testName = "imageUpload",
            dataProvider = "dataProvider",dataProviderClass = TestData.class)
    public void imageUpload(TestContext testContext){
        imageUpload.invoke(testContext).baseAssert(testContext)
    }
}
