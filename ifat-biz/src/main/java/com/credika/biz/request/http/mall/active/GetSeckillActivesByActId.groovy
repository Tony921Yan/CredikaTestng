package com.credika.biz.request.http.mall.active

import com.credika.biz.request.http.mall.MallPost
import com.credika.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext

/**
 * @author Remy*
 * @date 2022/07/18 23:24
 * @Vession v3.1
 * */
class GetSeckillActivesByActId extends MallPost{
    {
        super.api = "active/getSeckillActivesByActId"
        super.params = ["activityId"]
    }

    GetSeckillActivesByActId invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetSeckillActivesByActId baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }
    GetSeckillActivesByActId specialAssert(TestContext testContext){
        //秒杀条件：中台活动管理配置未开始/进行中的秒杀活动后，仍需要在小程序装修中发布秒杀活动的组件才能展示在C端首页
        //目前秒杀活动仅支持在首页的默认页，不支持其他任何模板页
        List<Map> apiResult = testContext.getResponse().data.data
        if(apiResult == null){return this}

        //通过活动主表中过滤未开始/进行中的秒杀活动ID与接口请求返回的ID是否一致
        def mysqlResult = MysqlService.GetSeckillActive();
        println mysqlResult
        for(int i=0;i<=mysqlResult.getAt(i);i++){assert apiResult.getAt(i).getAt("activeMainId") == mysqlResult.getAt(i)}
        //通过活动主表中过滤未开始/进行中的秒杀活动ID与接口请求返回的ID数量是否一致
        println "test"
        assert apiResult.getAt("activeMainId").size() == mysqlResult.size()

        //通过中台装修管理秒杀活动返回的值与请求返回的数据是否一致
        def mysqlResult1 = MysqlService.GetSeckillActiveFromDecorate();
        if(mysqlResult1 == null){return this}
    }
}
