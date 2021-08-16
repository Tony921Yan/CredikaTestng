package com.meiji.test.other.picture

import com.meiji.biz.api.MysqlAPI
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import javax.imageio.ImageIO
import java.awt.image.BufferedImage

class ItemPictureDebug {
    @Test(dataProvider = "data",groups = ["prod"],threadPoolSize = 10)
    void test(TestContext testContext){
        String url = testContext.url
        String saveFile = testContext.saveFile
        InputStream inputStream = new URL(url).openStream()
        BufferedImage bufferedImage = ImageIO.read(inputStream)

        InputStream inputStream2 = new URL(url).openStream()
        byte[] array = new byte[1024];
        int size = 0;
        int length = 0;
        while ((length = inputStream2.read(array)) != -1) {
            size += length;
        }
        size = Math.round(size/1024)
        testContext.appendLog(new Record("商品spuCode",testContext.spuCode))
        testContext.appendLog(new Record("图片路径",testContext.url))
        testContext.appendLog(new Record("图片大小",size))
        testContext.appendLog(new Record("图片尺寸",bufferedImage.getWidth()+"*"+bufferedImage.getHeight()))
        int picSize = bufferedImage.getWidth() * bufferedImage.getHeight()
        if(picSize >= 750*1000 && size > 600) {
            println("\$client.DownloadFile('"+url+"','"+saveFile+"')")
        }else if(picSize >= 800*800 && picSize < 750*1000 && size > 500) {
            println("\$client.DownloadFile('"+url+"','"+saveFile+"')")
        }else if(picSize >= 400*400 && picSize < 800*800 && size > 400){
            println("\$client.DownloadFile('"+url+"','"+saveFile+"')")
        } else if(picSize >= 200*200 && picSize < 400*400 && size > 300){
            println("\$client.DownloadFile('"+url+"','"+saveFile+"')")
        }
        inputStream.close()
        inputStream2.close()
    }

    @DataProvider
    TestContext[] data(){
        String savePath = "D:\\picBanner"
        List list = new ArrayList()
        List  picList = MysqlAPI.platformGoodsSql.rows("select pic.url as url,spu.code as spuCode from goods_pic pic left join goods_spu spu on pic.spu_id = spu.id where pic.is_delete = 0 and pic.gmt_modified > date_sub(curdate(),interval 180 day)  and spu.code is not null order by pic.gmt_modified desc")
        picList.forEach {
            TestContext testContext = new TestContext()
            String url = it.url
            String[] s = url.split("/")
            String fileName = s[s.size()-1]
            String code = it.spuCode
            String saveFile = savePath + "\\" + code + "_" + fileName
            testContext.put("spuCode",code)
            testContext.put("url",url)
            testContext.put("description",url)
            testContext.put("saveFile",saveFile)
            list.add(testContext)
        }
        println("当前巡检图片张数:"+list.size())
        println("mkdir "+ savePath)
        println("\$client = new-object System.Net.WebClient")
        return list
    }
}
