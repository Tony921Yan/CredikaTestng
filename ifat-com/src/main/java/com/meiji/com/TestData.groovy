package com.meiji.com


import com.miyuan.util.ResourceUtil
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import java.lang.annotation.Annotation
import java.lang.reflect.Method

class TestData {
    @DataProvider(name = "dataProvider")
    TestContext[] getTestData(Method method) {
        String testName
        String testDescription
        Annotation[] annotations = method.getDeclaredAnnotations()
        for(Annotation annotation:annotations){
            if (annotation.annotationType().typeName == Test.typeName){
                Test test = (Test)annotation
                testName = test.testName()
                testDescription = test.description()
            }
        }
        Map map = ResourceUtil.getTestData(testName)
        TestContext testContext = new TestContext()
        map.each {x->
            testContext.put(x.key,x.value)
        }
        testContext.put("description",testDescription)
        return [testContext]
    }
}
