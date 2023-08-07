package com.miyuan.ifat.support.util
import org.apache.commons.codec.binary.Base64
import org.testng.annotations.Test

import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

class DingTalkUtil {
    public static void send(String url, String secret, String title,String content){
        StringBuilder urlBuilder = new StringBuilder()
        Long timestamp = System.currentTimeMillis()
        String stringToSign = timestamp + "\n" + secret
        Mac mac = Mac.getInstance("HmacSHA256")
        mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"))
        byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"))
        String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)),"UTF-8")
        urlBuilder.append(url)
        urlBuilder.append("&timestamp=")
        urlBuilder.append(timestamp)
        urlBuilder.append("&sign=")
        urlBuilder.append(sign)
        Map message = new HashMap()
        Map markdown = new HashMap()
        markdown.put("text",content)
        markdown.put("title",title)
        message.put("markdown",markdown)
        message.put("msgtype","markdown")
        HttpUtil.post(urlBuilder.toString(),[:],message)
    }

    @Test
    void test(){
        String url = "https://oapi.dingtalk.com/robot/send?access_token=afa842b88b239ed494d897e7baf081d2b432e4047dec21b7f0a52c5c66461c47"
        String secret = "SECaeb4676f487406e95205c5c4b7367afeaf4fd1b440f1dd27182f0837fb5ef7ee"
        send(url,secret,"assert testContext.getResponse().code == \"B10018\"\n" +
                "       |           |             |    |\n" +
                "       |           |             |    false\n" +
                "       |           |             'B00000'","content")

    }

}
