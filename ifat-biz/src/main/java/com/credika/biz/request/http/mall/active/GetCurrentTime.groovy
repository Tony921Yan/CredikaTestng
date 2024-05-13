package com.credika.biz.request.http.mall.active

import com.credika.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

import java.text.SimpleDateFormat

/**
 * @author Remy*
 * @date 2022/04/21 9:24
 * @Vession v2.7.1
 * */
class GetCurrentTime extends MallPost{
    {
        super.api = "active/getCurrentTime"
        super.params = []
    }

    GetCurrentTime invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetCurrentTime baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetCurrentTime specialAssert(TestContext testContext){
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = new Date(); // 获取当前时间
        String format = sdf.format(time);// 格式化时间
        // 时间转换为时间戳
        // getTime返回自1970年01月01日00时00分00秒(北京时间1970年01月01日08时00分00秒)起至现在的总毫秒数.
        // 时间戳是指自1970年01月01日00时00分00秒(北京时间1970年01月01日08时00分00秒)起至现在的总秒数
        long localTime = time.getTime() / 1000L;
//        System.out.println("当前时间："+time);
//        System.out.println("当前时间（格式化）："+format);
//        System.out.println("当前时间戳："+localTime);
        String apiResult = testContext.getResponse().data.data  //接口返回用String接收
        Date api = sdf.parse(apiResult)   //将String转成Date
        long apiTime = api.getTime() /1000L // 将Date转成long进行比较
        assert  localTime - apiTime <= Math.abs(5)

    }
}
