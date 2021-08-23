package com.meiji.biz.request.http.scrm.group

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/23-17:30
 */
class GetGroupList extends ScrmPost{
    {
        super.api = "scrm/group/list"
        super.params = ["addChannel", "addEndTime", "addStartTime", "corpId", "employeeId", "gmtCreate", "gmtModified", "groupTagId", "id", "name", "order", "ownerId", "state", "version"]
    }
}
