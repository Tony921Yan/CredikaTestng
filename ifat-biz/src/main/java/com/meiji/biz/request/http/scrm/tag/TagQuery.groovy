package com.meiji.biz.request.http.scrm.tag

import com.meiji.biz.request.http.scrm.ScrmGet

/**
 *
 @author s1mple
 @create 2021/8/23-16:21
 */
class TagQuery extends ScrmGet{
    {
        super.api = "scrm/tag/query"
        super.params=["groupId"]
    }
}
