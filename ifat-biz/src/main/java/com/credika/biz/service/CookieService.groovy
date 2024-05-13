package com.credika.biz.service

import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.MD5Utils
import com.miyuan.ifat.support.util.TokenUtil
import org.apache.http.Header
import org.apache.http.HttpEntity
import org.apache.http.client.methods.CloseableHttpResponse
import org.apache.http.util.EntityUtils

class CookieService {
    static Map cacheCookie = new HashMap()
    /*
      avatar: string,
      isRegistered: boolean,
      nickname: string,
      openId: string,
      phone: string,
      token: string,
      userId: number,
      inviteUserId: number | null,
      jmUser: ChatAccount | null,
   */
    static String getMallCookie(String url,Long userId,Long dealerId) {
       String cookie = cacheCookie.get("mall:" + userId)
        if (cookie != null) {
            return cookie
        }
        StringBuilder stringBuilder = new StringBuilder()
        String token = TokenUtil.generateToken(userId)
        Map cookieParam = new HashMap()
        Map userInfo = new HashMap()
        userInfo.put("userId", userId)
        userInfo.put("token", token)
        userInfo.put("userType",2)
        Map shopInfo = new HashMap()
        shopInfo.put("dealerId",dealerId)
        shopInfo.put("authState",40)
        userInfo.put("shopInfo",shopInfo)
        cookieParam.put("secret", "+0ea81c0ea81557c9==")
        cookieParam.put("info", userInfo)
        def response = HttpUtil.post(url + "/login/__test__", [:], cookieParam)
//        def response = HttpUtil.post(url + "app/user/login", [:], cookieParam)
        Header[] headers = response.getHttpHeaders()
        for (Header header : headers) {
            stringBuilder.append(header.elements.head().toString().split(";")[0])
            stringBuilder.append(";")
        }
        sleep(1000)
        cacheCookie.put("mall:" + userId, stringBuilder.toString())
        return stringBuilder.toString()
    }

    /*
        avatar: string,
        dealerId: number,
        isRegistered: boolean,
        nickname: string,
        openId: string,
        phone: string,
        shopId: number,
        shopIdList: number[],
        token: string,
        city?: string,
        country?: string,
        gender?: number,
        province?: string,
        imUserId?: string,
        imPassword?: string,
        jmUser: ChatAccount | null,
     */
    static String getShopCookie(String url,Long dealerId){
        String cookie = cacheCookie.get("dealerId:"+dealerId)
        if(cookie!=null){
            return cookie
        }
        StringBuilder stringBuilder = new StringBuilder()
        String token = TokenUtil.generateToken(dealerId)
        Map cookieParam = new HashMap()
        Map cookieInfo = new HashMap()
        cookieInfo.put("leaderId",dealerId)
        cookieInfo.put("token",token)
        cookieParam.put("secret","+0ea81c0ea81557c9==")
        cookieParam.put("info",cookieInfo)
        def result = HttpUtil.post(url+"/login/__test__", [:], cookieParam)
        List<Header> headers = result.getHttpHeaders()
        for(Header header:headers){
            stringBuilder.append(header.elements.head().toString().split (";")[0])
            stringBuilder.append(";")
        }
        cookie =  stringBuilder.toString()
        cacheCookie.put("dealerId:"+dealerId,cookie)
        return cookie
    }

//    static String getPlatformCookie(String url,String username,String password){
//        String cookie = cacheCookie.get("platform1:"+username)
//        System.out.println(cookie)
//        if(cookie!=null){
//            return cookie
//        }
//        Map param = new HashMap()
//        param.put("username",username)
//        param.put("password",password)
//        StringBuilder stringBuilder = new StringBuilder()
//        def result = HttpUtil.post(url+"/platform/login", [:], param)
//        System.out.println(result)
//        Header[] headers = result.getHttpHeaders()
//        for(Header header:headers){
//            stringBuilder.append(header.elements.head().toString().split (";")[0])
//            stringBuilder.append(";")
//        }
//        cookie =  stringBuilder.toString()
//        cacheCookie.put("platform1:"+username,cookie)
//        return cookie
//    }


    static getPlatformCookie(String url, String username, String password) {
        String cookie = cacheCookie.get("platform2:" + username);
        if (cookie != null) {
            return cookie;
        }
        Map<String, String> param = new HashMap<>();
        param.put("username", username);
        param.put("password", password);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            def result = HttpUtil.post(url + "/signIn", [:], param);
            System.out.println(result);
            // 假设token字段在HTTP响应体中
            String responseBody = result.getResp().data.token;
            System.out.println(responseBody);
            if (responseBody != null && !responseBody.isEmpty()) {
                cookie = responseBody;
                System.out.println(cookie);
                cacheCookie.put("platform2:" + username, cookie);
                return cookie;
            } else {
                System.out.println("Token not found in response body.");
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            return null;
        }
    }


    static String getOMSCookie(String url,String username,String password){
        String cookie = cacheCookie.get("cms:"+username)
        if(cookie!=null){
            return cookie
        }
        Map param = new HashMap()
        param.put("username",username)
        param.put("password",password)
        StringBuilder stringBuilder = new StringBuilder()
        def result = HttpUtil.post(url+"/login/check", [:], param)
        Header[] headers = result.getHttpHeaders()
        for(Header header:headers){
            stringBuilder.append(header.elements.head().toString().split (";")[0])
            stringBuilder.append(";")
        }
        cookie =  stringBuilder.toString()
        cacheCookie.put("cms:"+username,cookie)
        return cookie
    }
}
