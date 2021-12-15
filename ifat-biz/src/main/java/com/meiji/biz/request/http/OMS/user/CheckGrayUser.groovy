package com.meiji.biz.request.http.OMS.user

import com.meiji.biz.request.http.OMS.OMSPost

class CheckGrayUser extends OMSPost{
    {
        super.api = "/user/checkGrayUser"
        super.params =  ["grayUserId"]
    }
}
