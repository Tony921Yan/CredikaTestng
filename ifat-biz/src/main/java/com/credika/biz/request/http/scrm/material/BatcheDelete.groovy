package com.credika.biz.request.http.scrm.material

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/9/18-11:16
 */
class BatcheDelete extends ScrmPost{
    {
        super.api = "scrm/material/batcheDelete"
        super.params = ["groupId",
                        "idList"]
    }
}
