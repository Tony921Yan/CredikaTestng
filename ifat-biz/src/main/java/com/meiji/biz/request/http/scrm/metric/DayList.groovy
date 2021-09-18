package com.meiji.biz.request.http.scrm.metric

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-14:43
 */
class DayList extends ScrmPost{
    {
        super.api = "scrm/group/metric/dayList"
        super.params = [
                "condition",
                "order",
                "page",
                "rows",
                "sort"]
    }
}
