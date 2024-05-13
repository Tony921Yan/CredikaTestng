package com.credika.biz.request.http.scrm.metric

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/9/18-14:55
 */
class GetTrendList extends ScrmGet{
    {
        super.api = "scrm/group/metric/getTrendList"
        super.params = ["firstDepartment", "lastDepartment", "metricCreate", "name", "secondDepartment", "shopId", "timeType"]
    }
}
