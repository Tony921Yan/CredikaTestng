package com.credika.biz.request.http.scrm.metric

import com.credika.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/9/18-15:02
 */
class Statistical extends ScrmGet{
    {
        super.api = "scrm/group/metric/statistical"
        super.params = ["firstDepartment", "lastDepartment", "metricCreate", "name", "secondDepartment", "shopId", "timeType"]
    }
}
