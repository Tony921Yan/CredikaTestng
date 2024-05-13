package com.credika.biz.request.http.scrm.corp

import com.credika.biz.request.http.scrm.ScrmPost

/**
 *
 @author s1mple
 @create 2021/8/20-15:51
 */
class AgentConfig extends ScrmPost{
    {
        super.api="scrm/corp/agentConfig"
        super.params = ["corpId",
                        "employeeId",
                        "gmtCreate",
                        "gmtModified",
                        "id",
                        "state",
                        "url",
                        "version"]
    }

}
