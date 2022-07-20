package com.meiji.biz.request.http.mall.active

import com.meiji.biz.request.http.mall.MallPost
import com.meiji.biz.service.MysqlService
import com.miyuan.ifat.support.test.TestContext
import com.miyuan.ifat.support.util.DateUtil

import java.sql.Timestamp
import java.text.SimpleDateFormat

/**
 * @author Remy*
 * @date 2022/04/20 9:24
 * @Vession v2.7.1
 * */
class GetSeckillTopGoods extends MallPost{
    {
        super.api = "active/getSeckillTopGoods"
        super.params = []
    }

    GetSeckillTopGoods invoke(TestContext testContext){
        super.invoke(testContext)
        return this
    }

    GetSeckillTopGoods baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }

    GetSeckillTopGoods specialAssert(TestContext testContext){
        Map apiResult = testContext.getResponse().data
        if(apiResult == null){return this}
        Map mysqlResult = MysqlService.getSeckillTopGoods()
        if(mysqlResult == null){return this}
        String begin_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mysqlResult.begin_time)
        String end_time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(mysqlResult.end_time)
        assert apiResult.beginTime == begin_time
        assert apiResult.endTime == end_time
        assert apiResult.activeMainId == mysqlResult.activity_id


    }
}
