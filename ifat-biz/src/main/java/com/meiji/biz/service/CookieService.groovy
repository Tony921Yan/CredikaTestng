package com.meiji.biz.service

import com.miyuan.ifat.support.util.HttpUtil
import com.miyuan.ifat.support.util.TokenUtil
import org.apache.http.Header
import org.apache.http.client.methods.CloseableHttpResponse

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
    static String getMallCookie(String url,Integer userId){
        String cookie = cacheCookie.get("mall:"+userId)
        if(cookie!=null){
            return cookie
        }
        StringBuilder stringBuilder = new StringBuilder()
        String token = TokenUtil.generateToken(userId)
        Map cookieParam = new HashMap()
        Map cookieInfo = new HashMap()
        cookieInfo.put("userId",userId)
        cookieInfo.put("token",token)
        cookieParam.put("secret","+0ea81c0ea81557c9==")
        cookieParam.put("info",cookieInfo)
        CloseableHttpResponse response = HttpUtil.postV2(url+"/login/__test__", [:], cookieParam)
        Header[] headers = response.getHeaders("Set-Cookie")
        for(Header header:headers){
            stringBuilder.append(header.elements.head().toString().split (";")[0])
            stringBuilder.append(";")
        }
        cookie =  stringBuilder.toString()
        cacheCookie.put("mall:"+userId,cookie)
        return cookie
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
    static String getShopCookie(String url,Integer shopId){
        String cookie = cacheCookie.get("shop:"+shopId)
        if(cookie!=null){
            return cookie
        }
        StringBuilder stringBuilder = new StringBuilder()
        String token = TokenUtil.generateToken(shopId)
        Map cookieParam = new HashMap()
        Map cookieInfo = new HashMap()
        cookieInfo.put("userId",shopId)
        cookieInfo.put("token",token)
        cookieParam.put("secret","+0ea81c0ea81557c9==")
        cookieParam.put("info",cookieInfo)
        CloseableHttpResponse response = HttpUtil.postV2(url+"/login/__test__", [:], cookieParam)
        Header[] headers = response.getHeaders("Set-Cookie")
        for(Header header:headers){
            stringBuilder.append(header.elements.head().toString().split (";")[0])
            stringBuilder.append(";")
        }
        cookie =  stringBuilder.toString()
        cacheCookie.put("shop:"+shopId,cookie)
        return cookie
    }
}
