package com.meiji.biz.request.http.scrm.material

import com.meiji.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-11:21
 */
class BatcheUpdate extends ScrmPost{
    {
        super.api = "scrm/material/batcheUpdate"
        super.params = ["groupId",
                        "idList"]
    }
}
