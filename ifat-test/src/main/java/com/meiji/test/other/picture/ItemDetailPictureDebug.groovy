package com.meiji.test.other.picture

import com.meiji.biz.api.MysqlAPI
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import org.testng.annotations.CustomAttribute
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import javax.imageio.ImageIO
import javax.xml.stream.events.Attribute
import java.awt.image.BufferedImage
import java.util.regex.Matcher
import java.util.regex.Pattern
import java.util.stream.Collectors

class ItemDetailPictureDebug{
    @Test(dataProvider = "data",groups = ["prod"],threadPoolSize = 20)
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
        if(picSize >= 750*4000 && size > 1000) {
            println("\$client.DownloadFile('" + url + "','" +saveFile+"')")
        }else if(picSize >= 750*2000 && picSize < 750*4000 && size>800) {
            println("\$client.DownloadFile('"+url+"','"+saveFile+"')")
        }else if(picSize >= 750*1000 && picSize < 750*2000 && size > 600) {
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
        String savePath = "D:\\picDetail"
        List list = new ArrayList()
        List  picList = MysqlAPI.platformGoodsSql.rows("select code,detail from goods_spu where status = 4 and gmt_modified > date_sub(curdate(),interval 30 day) order by gmt_modified desc")
        picList.each{it ->
            String detail = it.detail
            InputStream inputStream = new URL(detail).openStream()
            String text = new BufferedReader(new InputStreamReader(inputStream))
                    .lines().collect(Collectors.joining(System.lineSeparator()))

            String regex = "src=\"(.*?)\""
            Pattern pa = Pattern.compile(regex, Pattern.DOTALL);
            Matcher ma = pa.matcher(text);
            while (ma.find())
            {
                String src = ma.group();
                String regex1 = "http(.*?)(.jpg|.png|.jpeg)";
                Pattern pa1 = Pattern.compile(regex1, Pattern.DOTALL);
                Matcher ma1 = pa1.matcher(src);
                while (ma1.find())
                {
                    TestContext testContext = new TestContext()
                    String url = ma1.group()
                    String[] s = url.split("/")
                    String fileName = s[s.size()-1]
                    String code = it.code
                    String saveFile = savePath + "\\" + code + "_" + fileName
                    testContext.put("spuCode",code)
                    testContext.put("url",url)
                    testContext.put("description",url)
                    testContext.put("saveFile",saveFile)
                    list.add(testContext)
                }
            }
        }
        println("当前巡检图片张数:"+list.size())
        println("mkdir "+ savePath)
        println("\$client = new-object System.Net.WebClient")
        return list
    }
}
