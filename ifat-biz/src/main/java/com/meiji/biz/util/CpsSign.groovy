package com.meiji.biz.util

import javax.xml.bind.DatatypeConverter
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import com.miyuan.ifat.support.util.MD5Utils

class CpsSign {
    private static String secret = "7BF8D7BC15"
    static String sign(Map map){
        StringBuffer paramStr = new StringBuffer(secret);
        for (String key : map.keySet()) {
            paramStr.append(key);
            paramStr.append("=");
            paramStr.append(map.get(key));
            paramStr.append("&");
        }
        paramStr.substring(0, paramStr.length()-1);
        paramStr.append(secret);
        String sign = MD5Utils.MD5Encode(URLEncoder.encode(paramStr.toString(),"UTF-8"), "UTF-8");
        return sign.toUpperCase();

//        final String strA = map.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey())
//                .map(e -> String.format("%s=%s", ((Map.Entry) e).getKey(), ((Map.Entry) e).getValue()))
//                .reduce((x, y) -> x + "&" + y)
//                .orElse("");
//
//        // 3、字符串A的前后加上secret组成字符串B
//        String strB = secret + strA + secret;

        // 4、对字符串B进行encode后MD5加密，取大写，得到签名sign
        //String sign = md5(strB);
        //return sign
    }

    private static String md5(String content) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(URLEncoder.encode(content, StandardCharsets.UTF_8.name()).getBytes(StandardCharsets.UTF_8));
        return DatatypeConverter.printHexBinary(md.digest());
    }
}
