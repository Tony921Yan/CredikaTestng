package com.meiji.test.other.picture

import com.meiji.biz.api.MysqlAPI
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import javax.imageio.ImageIO
import java.awt.image.BufferedImage

class ItemPictureTest extends BaseTest {
    @Test(dataProvider = "data",groups = ["prod"],threadPoolSize = 10)
    void test(TestContext testContext){
        String url = testContext.url
        InputStream inputStream = new URL(url).openStream()
        BufferedImage bufferedImage = ImageIO.read(inputStream)
        URLConnection connection = new URL(url).openConnection()
        Long size = Math.round(connection.contentLength/1024)
        testContext.appendLog(new Record("商品spuCode",testContext.spuCode))
        testContext.appendLog(new Record("图片路径",testContext.url))
        testContext.appendLog(new Record("图片大小",size))
        testContext.appendLog(new Record("图片尺寸",bufferedImage.getWidth()+"*"+bufferedImage.getHeight()))
        int picSize = bufferedImage.getWidth() * bufferedImage.getHeight()
        if(picSize >= 750000) {
            assert size < 600,"spuCode:" + testContext.spuCode
        }else if(picSize >= 640000) {
            assert size < 500,"spuCode:" + testContext.spuCode
        }else if(picSize >= 160000){
            assert size < 400,"spuCode:" + testContext.spuCode
        } else if(picSize >= 40000){
            assert size < 300,"spuCode:" + testContext.spuCode
        }
        inputStream.close()
    }

    @DataProvider
    TestContext[] data(){
        List list = new ArrayList()
        List  picList = MysqlAPI.platformGoodsSql.rows("select pic.url as url,spu.code as spuCode from goods_pic pic left join goods_spu spu on pic.spu_id = spu.id where pic.is_delete = 0 and spu.status = 4 and pic.gmt_modified > date_sub(curdate(),interval 1 day)  and spu.code is not null order by pic.gmt_modified desc limit 1000")
        picList.forEach {
            TestContext testContext = new TestContext()
            testContext.put("spuCode",it.spuCode)
            testContext.put("url",it.url)
            testContext.put("description",it.url)
            list.add(testContext)
        }
        return list
    }
}
