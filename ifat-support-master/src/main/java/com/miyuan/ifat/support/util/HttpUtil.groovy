package com.miyuan.ifat.support.util

import com.miyuan.ifat.support.vo.Result
import groovy.json.JsonOutput
import org.apache.commons.lang3.StringUtils
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse
import org.apache.http.client.HttpClient
import org.apache.http.client.config.AuthSchemes
import org.apache.http.client.config.CookieSpecs
import org.apache.http.client.config.RequestConfig
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.config.Registry
import org.apache.http.config.RegistryBuilder
import org.apache.http.conn.socket.ConnectionSocketFactory
import org.apache.http.conn.socket.PlainConnectionSocketFactory
import org.apache.http.conn.ssl.NoopHostnameVerifier
import org.apache.http.conn.ssl.SSLConnectionSocketFactory
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager
import org.apache.http.util.EntityUtils

import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager
import java.security.cert.X509Certificate

class HttpUtil {
    private static HttpClientBuilder httpClientBuilder = HttpClientBuilder.create()
    private static HttpClient httpClient = createInstance()

    public static HttpClient createInstance(){
        httpClientBuilder = HttpClientBuilder.create()
        X509TrustManager trustManager = new X509TrustManager() {
            @Override public X509Certificate[] getAcceptedIssuers() {
                return null
            }
            @Override public void checkClientTrusted(X509Certificate[] xcs, String str) {}
            @Override public void checkServerTrusted(X509Certificate[] xcs, String str) {}
        }
        SSLContext ctx = SSLContext.getInstance(SSLConnectionSocketFactory.TLS)
        ctx.init(null, trustManager as TrustManager[], null)
        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(ctx, NoopHostnameVerifier.INSTANCE);
        // 创建Registry
        RequestConfig requestConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD_STRICT)
                .setExpectContinueEnabled(Boolean.TRUE).setTargetPreferredAuthSchemes(Arrays.asList(AuthSchemes.NTLM,AuthSchemes.DIGEST))
                .setProxyPreferredAuthSchemes(Arrays.asList(AuthSchemes.BASIC))
                .setConnectTimeout(30000)
                .setSocketTimeout(30000)
                .setConnectionRequestTimeout(30000)
                .build();
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("http", PlainConnectionSocketFactory.INSTANCE)
                .register("https",socketFactory).build();
        // 创建ConnectionManager，添加Connection配置信息
        PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        connectionManager.setDefaultMaxPerRoute(1024);
        connectionManager.setMaxTotal(1000);
        httpClientBuilder.setSSLContext(ctx)
        httpClientBuilder.setDefaultRequestConfig(requestConfig)
        httpClientBuilder.setConnectionManager(connectionManager)
        httpClient =  httpClientBuilder.build()
        return httpClient
    }
    /**
     * get
     * @param url
     * @param headers
     * @param params
     * @throws Exception
     */
    public static Result get(String url,Map<String, String> headers,Map<String, String> params){
        Result res = new Result()
        HttpEntity httpEntity = null
        StringBuilder sbUrl = new StringBuilder()
        sbUrl.append(url)
        if (null != params) {
            StringBuilder sbQuery = new StringBuilder()
            for (Map.Entry<String, String> query : params.entrySet()) {
                if (0 < sbQuery.length()) {
                    sbQuery.append("&")
                }
                if (StringUtils.isBlank(query.getKey()) && !StringUtils.isBlank(query.getValue())) {
                    sbQuery.append(query.getValue())
                }
                if (!StringUtils.isBlank(query.getKey())) {
                    sbQuery.append(query.getKey())
                    if (!StringUtils.isBlank(query.getValue().toString())) {
                        sbQuery.append("=")
                        sbQuery.append(URLEncoder.encode(query.getValue().toString(), "utf-8"))
                    }
                }
            }
            if (0 < sbQuery.length()) {
                sbUrl.append("?").append(sbQuery)
            }
        }
        HttpGet request = new HttpGet(sbUrl.toString())
        for (Map.Entry<String, String> e : headers.entrySet()) {
            request.addHeader(e.getKey(), e.getValue().toString())
        }
        try {
            HttpResponse httpResponse = httpClient.execute(request)
            res.setHttpStatusCode(httpResponse.getStatusLine().getStatusCode())
            res.setHttpHeaders(httpResponse.getHeaders("Set-Cookie") as List)
            httpEntity = httpResponse.getEntity()
            if (httpEntity != null) {
                String body = EntityUtils.toString(httpEntity, "UTF-8")
                res.setResp(JsonUtil.objectParse(body))
            }
        }catch(Exception e){
            res.setHttpStatusCode("error")
            res.setErrorMessage(e.getMessage())
            e.printStackTrace()
        } finally {
            if (httpEntity != null) {
                try {
                    EntityUtils.consumeQuietly(httpEntity)
                } catch (Exception e) {
                    e.printStackTrace()
                }
            }
        }
        return res
    }

    /**
     * post form
     * @param url
     * @param method
     * @param headers
     * @param params
     * @return
     * @throws Exception
     */
    public static Result post(String url, Map headers, Object params) {
        Result res = new Result()
        HttpEntity httpEntity = null
        HttpPost request = new HttpPost(url)
        for (Map.Entry<String, Object> e : headers.entrySet()) {
            request.addHeader(e.getKey(), String.valueOf(e.getValue()))
        }
        if (params != null) {
            String data = JsonOutput.toJson(params)
            StringEntity entity = new StringEntity(data, "utf-8")
            entity.setContentType("application/json")
            request.setEntity(entity)
        }
        try {
            HttpResponse httpResponse = httpClient.execute(request)
            res.setHttpStatusCode(httpResponse.getStatusLine().getStatusCode())
            res.setHttpHeaders(httpResponse.getHeaders("Set-Cookie") as List)
            httpEntity = httpResponse.getEntity()
            if (httpEntity != null) {
                String body = EntityUtils.toString(httpEntity, "UTF-8")
                res.setResp(JsonUtil.objectParse(body))
            }
        }catch(Exception e){
            res.setHttpStatusCode("error")
            res.setErrorMessage(e.getMessage())
            e.printStackTrace()
        } finally {
            if (httpEntity != null) {
                try {
                    EntityUtils.consumeQuietly(httpEntity)
                } catch (Exception e) {
                    e.printStackTrace()
                }
            }
        }
        return res
    }

    public static String getRequestUrl(String url,Map<String, String> params) {
        StringBuilder sbUrl = new StringBuilder()
        sbUrl.append(url)
        if (null != params) {
            StringBuilder sbQuery = new StringBuilder()
            for (Map.Entry<String, String> query : params.entrySet()) {
                if (0 < sbQuery.length()) {
                    sbQuery.append("&")
                }
                if (StringUtils.isBlank(query.getKey()) && !StringUtils.isBlank(query.getValue())) {
                    sbQuery.append(query.getValue())
                }
                if (!StringUtils.isBlank(query.getKey())) {
                    sbQuery.append(query.getKey())
                    if (!StringUtils.isBlank(query.getValue())) {
                        sbQuery.append("=")
                        sbQuery.append(URLEncoder.encode(query.getValue(), "utf-8"))
                    }
                }
            }
            if (0 < sbQuery.length()) {
                sbUrl.append("?").append(sbQuery)
            }
        }
        return sbUrl.toString()
    }
}