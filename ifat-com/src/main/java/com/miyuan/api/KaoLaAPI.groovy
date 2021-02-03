package com.miyuan.api

import com.miyuan.channel.request.kaola.QueryGoodsInfoRequest
import com.miyuan.channel.request.kaola.QueryShareLinkRequest
import com.miyuan.util.*
import org.apache.commons.beanutils.BeanUtils

class KaoLaAPI {
    static Map beanData = ResourceUtil.getBeanData("kaola")
    static Map queryShareLink(QueryShareLinkRequest req){
        return request(req)
    }

    static Map queryGoodsInfo(QueryGoodsInfoRequest req){
        return request(req)
    }

    private static Map request(Object obj) {
        Map params = BeanUtils.describe(obj);
        params.remove("class");
        params.remove("metaClass")
        String url = beanData.get("url")
        String methodVersion = beanData.get("methodVersion")
        String signMethod = beanData.get("signMethod")
        String zhuangKeId = beanData.get("zhuangKeId")
        String secretKey = beanData.get("secretKey")
        String timestamp = DateUtil.dateToStr(new Date())
        params.put("v", methodVersion);
        params.put("timestamp", timestamp);
        params.put("signMethod", signMethod);
        params.put("unionId", zhuangKeId);
        String sign = SignUtil.kaoLaSign(secretKey,params)
        params.put("sign",sign)
       // params.put("timestamp", URLEncoder.encode(timestamp, "utf-8"));
        String requestUrl = HttpUtil.getRequestUrl(url,params)
        String response = HttpUtil.post(requestUrl,[:],[:])
        return JsonUtil.strToJson(response) as Map
    }
}
