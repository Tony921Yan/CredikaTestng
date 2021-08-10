package com.meiji.test.other.picture

import com.meiji.biz.api.MysqlAPI
import com.miyuan.ifat.support.test.BaseTest
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.vo.Record
import com.sun.jndi.toolkit.url.Uri
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import javax.imageio.ImageIO
import java.awt.image.BufferedImage
import java.util.regex.Matcher
import java.util.regex.Pattern
import java.util.stream.Collectors

class ItemDetailPictureTest extends BaseTest {
    @Test(dataProvider = "data",groups = ["prod"])
    void test(TestContext testContext){
        String url = testContext.url
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
        if(picSize >= 3000000) {
            assert size < 1000, "spuCode:" + testContext.spuCode
        }else if(picSize >= 1500000) {
            assert size < 800, "spuCode:" + testContext.spuCode
        }else if(picSize >= 750000) {
            assert size < 600,"spuCode:" + testContext.spuCode
        }else if(picSize >= 640000) {
            assert size < 500,"spuCode:" + testContext.spuCode
        }else if(picSize >= 160000){
            assert size < 400,"spuCode:" + testContext.spuCode
        } else if(picSize >= 40000){
            assert size < 300,"spuCode:" + testContext.spuCode
        }
        inputStream.close()
        inputStream2.close()
    }

    @DataProvider
    TestContext[] data(){
        List list = new ArrayList()
        List  picList = MysqlAPI.platformGoodsSql.rows("select code,detail from goods_spu order by gmt_modified desc limit 200")
        picList.forEach{it ->
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
                    testContext.put("spuCode",it.code)
                    testContext.put("url",ma1.group())
                    testContext.put("description",ma1.group())
                    list.add(testContext)
                }
            }


//            String regEx_img = "]*?>"
//            Pattern p_image = Pattern.compile(regEx_img, Pattern.CASE_INSENSITIVE)
//            Matcher m_image = p_image.matcher(text)
//            String img = ""
//            while(m_image.find()) {
//                img =m_image.group()
//                Matcher m = Pattern.compile("src\s*=\s*?(.*?)(|>|\s+)").matcher(img)
//                while(m.find()) {
//                    TestContext testContext = new TestContext()
//                    testContext.put("spuCode",it.code)
//                    testContext.put("url",m.group(1))
//                    testContext.put("description",m.group(1))
//                    list.add(testContext)
//                }
//            }
        }
        return list
    }
}
