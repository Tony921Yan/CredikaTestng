package com.meiji.biz.request.http.scrm.metric

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-14:58
 */
class GroupList extends ScrmPost{
    {
        super.api = "scrm/group/metric/groupList"
        super.params = ["condition",
                        "order",
                        "page",
                        "rows",
                        "sort"]
    }
}
