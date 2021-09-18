package com.meiji.biz.request.http.scrm.role

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-16:12
 */
class Transit extends ScrmPost{
    {
        super.api = "scrm/role/transit"
        super.params = ["from",
                        "id",
                        "to"]
    }
}
