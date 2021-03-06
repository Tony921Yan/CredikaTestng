package com.meiji.request.http.goods

import com.meiji.com.TestContext
import com.meiji.request.http.MeijiRequest

class GetGoodsByPage extends MeijiRequest{
    {
        super.api = "/platform/goodsMgr/getGoodsByPage"
        super.params = [["categoryId","endDate","endNum","endPrice","pageNum","pageSize","skuCode","spuCodeAndName","startDate",
                         "startNum","startPrice"]]
    }

    MeijiRequest invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

}
