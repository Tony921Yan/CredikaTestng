package com.miyuan.com

import com.miyuan.util.ResourceUtil

class TestEnv {
    public static String getEnv(){
        String vmEnv = System.getProperty("env")
        String propertiesEnv = ResourceUtil.getEnvConfig("env")
        String env = vmEnv==null ? propertiesEnv:vmEnv
        if (env == null){
            return "uat01"
        }
        return env
    }

    public static String getIsGray(){
        String vmIsGray = System.getProperty("isGray")
        String propertiesIsGray = ResourceUtil.getEnvConfig("isGray")
        String isGray = vmIsGray==null ? propertiesIsGray:vmIsGray
        if (isGray == null){
            return "false"
        }
        return isGray
    }
}
