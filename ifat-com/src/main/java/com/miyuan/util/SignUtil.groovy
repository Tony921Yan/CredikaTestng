package com.miyuan.util

import java.nio.charset.StandardCharsets
import java.security.MessageDigest

class SignUtil {
    static String kaoLaSign(String secretKey,Map params){
        TreeMap map = new TreeMap()
        map.putAll(params)
        String sign = secretKey
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!entry.getKey().equals("sign")) {
                sign = sign + entry.getKey() + entry.getValue();
            }
        }

        sign = sign + secretKey;

        try {
            sign = md5Encode2UpperCase(sign);
        } catch (Exception e) {
            e.printStackTrace()
        }

        return sign;
    }

    private static String md5Encode2UpperCase(String sign) throws Exception {
        MessageDigest md5 = null;

        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            e.printStackTrace()
            return "";
        }

        byte[] byteArray = sign.getBytes(StandardCharsets.UTF_8);
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();

        for (int i = 0; i < md5Bytes.length; ++i) {
            int val = md5Bytes[i] & 255;
            if (val < 16) {
                hexValue.append("0");
            }

            hexValue.append(Integer.toHexString(val));
        }

        String rs = hexValue.toString().toUpperCase();
        return rs;
    }
}
