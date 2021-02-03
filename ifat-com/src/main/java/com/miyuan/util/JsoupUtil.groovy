package com.miyuan.util

import org.jsoup.Connection
import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class JsoupUtil {
    public static String getLocation(String url){
        Connection connection= Jsoup.connect(url)
        connection.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        connection.header("Accept-Encoding", "gzip, deflate, sdch");
        connection.header("Accept-Language", "zh-CN,zh;q=0.8");
        connection.header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36");
        Document document = connection.get()
        return  URLDecoder.decode(document.location(), "utf-8");
    }
}
