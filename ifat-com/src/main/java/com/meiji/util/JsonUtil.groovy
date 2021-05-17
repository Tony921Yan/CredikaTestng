package com.meiji.util

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.JSONObject
import com.fasterxml.jackson.databind.ObjectMapper
import org.apache.commons.lang3.ObjectUtils
import groovy.json.JsonSlurper

class JsonUtil {
    private static JsonSlurper jsonSlurper = new JsonSlurper()
    private static ObjectMapper mapper = new ObjectMapper();

    public static String prettyJson(Object obj) {
        String str = obj.toString()
        if(ObjectUtils.isEmpty(obj)){
            return ""
        }
        if(obj instanceof Map){
            JSONObject json = new JSONObject(obj)
            str = json.toString()
        }
        try {
            Object objMap = mapper.readValue(str,Object.class)
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(objMap)
        }catch (Exception e){
            return obj
        }

    }

    public static def strToJson(String str){
        return jsonSlurper.parseText(str)
    }

    public static def strJsonToJson(String str){
        return jsonSlurper.parseText(jsonSlurper.parseText(str) as String)
    }

    public static JSON objToJson(Object str){
        return JSON.parseObject(str)
    }

    public static JSON  objToJsonList(Object str){
        return JSON.parseArray(str)
    }


    public static String toJsonString(Object obj){
        return JSON.toJSONString(obj);
    }

    public static Object objectParse(Object obj){
        try {
            Object json= JSON.parse(obj.toString())
            return json
        } catch (Exception e) {
            return obj
        }
    }

    public static boolean isJSON(String str) {
        boolean result = false;
        try {
            Object obj= JSON.parse(str);
            result = true;
        } catch (Exception e) {
            result=false;
        }
        return result;
    }
}
