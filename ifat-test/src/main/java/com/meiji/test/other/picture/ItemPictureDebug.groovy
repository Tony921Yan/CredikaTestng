package com.meiji.test.other.picture

import com.meiji.biz.api.MysqlAPI
import com.miyuan.ifat.support.test.TestContext
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import javax.imageio.ImageIO
import java.awt.image.BufferedImage

class ItemPictureDebug {
    def filePath = "D:/picBanner.txt"
    File file = new File(filePath)
    @Test(dataProvider = "data",groups = ["prod"],threadPoolSize = 30)
    void test(TestContext testContext){
        String url = testContext.url
        String saveFile = testContext.saveFile
        InputStream inputStream = new URL(url).openStream()
        BufferedImage bufferedImage = ImageIO.read(inputStream)
        URLConnection connection = new URL(url).openConnection()
        Long size = Math.round(connection.contentLength/1024)
        int picSize = bufferedImage.getWidth() * bufferedImage.getHeight()
        if(picSize >= 750*1000 && size > 600) {
            file.append("\$client.DownloadFile('"+url+"','"+saveFile+"')"+"\r\n")
        }else if(picSize >= 800*800 && picSize < 750*1000 && size > 500) {
            file.append("\$client.DownloadFile('"+url+"','"+saveFile+"')"+"\r\n")
        }else if(picSize >= 400*400 && picSize < 800*800 && size > 400){
            file.append("\$client.DownloadFile('"+url+"','"+saveFile+"')"+"\r\n")
        } else if(picSize >= 200*200 && picSize < 400*400 && size > 300){
            file.append("\$client.DownloadFile('"+url+"','"+saveFile+"')"+"\r\n")
        }
        inputStream.close()
    }

    @DataProvider
    TestContext[] data(){
        String savePath = "D:\\picBanner"
        List list = new ArrayList()
        List  picList = MysqlAPI.meiji_goods.rows("select pic.url as url,spu.code as spuCode from goods_pic pic left join goods_spu spu on pic.spu_id = spu.id where pic.is_delete = 0 and spu.status = 4 and pic.gmt_modified > date_sub(curdate(),interval 30 day)  and spu.code is not null order by pic.gmt_modified desc")
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
        file.write("mkdir "+ savePath+"\r\n")
        file.append("\$client = new-object System.Net.WebClient"+"\r\n")
        return list
    }
}
