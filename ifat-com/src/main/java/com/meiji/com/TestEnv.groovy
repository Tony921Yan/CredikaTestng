package com.meiji.com

import com.meiji.util.ResourceUtil

class TestEnv {
    public static String getEnv(){
        String vmEnv = System.getProperty("env")
        String propertiesEnv = ResourceUtil.getEnvConfig("env")
        String env = vmEnv==null ? propertiesEnv:vmEnv
        if (env == null){
            return "uat"
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
