package com.meiji.biz.util

import org.codehaus.groovy.util.StringUtil

import javax.xml.bind.DatatypeConverter
import java.nio.charset.StandardCharsets
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import com.miyuan.ifat.support.util.MD5Utils

class CpsSign {
    static String sign(String secret, Map map){
        StringBuffer paramStr = new StringBuffer(secret);
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            if (!(null == entry.getValue()||entry.toString().length()==0)) {
                paramStr.append(entry.getKey());
                paramStr.append("=");
                paramStr.append(entry.getValue());
                if(iterator.hasNext())
                    paramStr.append("&");
            }
        }
        paramStr.append(secret);
        String sign = MD5Utils.MD5Encode(URLEncoder.encode(paramStr.toString(),"UTF-8"), "UTF-8");
        return sign.toUpperCase();
    }
}
