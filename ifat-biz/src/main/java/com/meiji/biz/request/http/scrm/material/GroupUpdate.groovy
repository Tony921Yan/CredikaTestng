package com.meiji.biz.request.http.scrm.material

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-10:56
 */
class GroupUpdate extends ScrmPost{
    {
        super.api = "scrm/material/group/update"
        super.params = ["id",
                        "key",
                        "title"]
    }
}
