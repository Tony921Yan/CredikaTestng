package com.meiji.util

import com.miyuan.com.TestEnv
import com.miyuan.constants.TestConstants

import groovy.io.FileType
import groovy.xml.XmlParser
import org.codehaus.groovy.reflection.ReflectionUtils

class ResourceUtil {
    public static String getSourcePath(){
        String tempPath =  ReflectionUtils.getClassLoader().getResource("./").getPath()
        return tempPath.replace("test-classes","classes")
    }

    public static String getEnvDataPath(){
        String tempPath =  ReflectionUtils.getClassLoader().getResource("./").getPath()
        String env = TestEnv.getEnv()
        if(env.startsWith("uat")){
            env = "uat"
        }
        String path = tempPath.replace("test-classes","classes") + "/data/"+ env
        return path
    }

    public static String getConfigPath(){
        String tempPath =  ReflectionUtils.getClassLoader().getResource("./").getPath()
        String path = tempPath.replace("test-classes","classes") + "/config/"
        return path
    }


    public static List getTestDataFiles() {
        String path = getEnvDataPath()
        def dir = new File(path)
        List list = new ArrayList()
        dir.traverse(type: FileType.FILES, nameFilter: ~/.*\.xml/) {
            list.add(it)
        }
        return list
    }

    public static Map<String,Object> getTestData(String key) {
        Map data = getCommonData()
        List files = getTestDataFiles()
        for (String file:files){
            XmlParser xmlParser = new XmlParser()
            def testData =  xmlParser.parse(file)
            testData.each { tests ->
                tests.attributes().each { test->
                    if(test.value== key){
                        tests.each { params ->
                            data.put(params.attributes().key.toString(),params.attributes().value)
                        }
                    }
                }
            }
        }
        return data
    }

    public static Map<String,Object> getCommonData() {
        Map<String,Object> map = new HashMap<String,Object>()
        XmlParser xmlParser = new XmlParser()
        def testData =  xmlParser.parse(getEnvDataPath()+TestConstants.commonDataFile)
        testData.each { tests ->
            tests.attributes().each { test->
                    tests.each { params ->
                        map.put(params.attributes().key.toString(),params.attributes().value)
                    }
            }
        }
        return map
    }

    public static Map<String,String> getBeanData(String name) {
        Map<String,String> map = new HashMap<String,String>()
        XmlParser xmlParser = new XmlParser()
        String path = getConfigPath()
        String beanFile = "bean-env.xml"
        String fileName = beanFile.replace("env",TestEnv.getEnv())
        String file = path + fileName
        def beanData =  xmlParser.parse(file)
        beanData.each { beans ->
            beans.attributes().each { bean->
                if(bean.value== name){
                    beans.each { params ->
                        map.put(params.attributes().key.toString(),params.attributes().value.toString())
                    }
                }
            }
        }
        return map
    }

    public static String getEnvConfig(String key) {
        String path = getSourcePath()
        String file = path + TestConstants.EnvFile
        def props = new Properties()
        props.load(new FileInputStream(new File(file)))
        return props.get(key)
    }

    public static String getFile(String fileName){
        return ReflectionUtils.getClassLoader().getResourceAsStream(fileName).getText("UTF-8")
    }
}
