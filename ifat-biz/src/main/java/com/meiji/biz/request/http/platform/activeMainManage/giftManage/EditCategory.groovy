package com.meiji.biz.request.http.platform.activeMainManage.giftManage
import com.meiji.biz.request.http.platform.PlatformPost
import com.miyuan.ifat.support.test.TestContext

class EditCategory extends PlatformPost{
    {
        super.api = "GiftManage/editCategory"
        super.params = ["id","name","status","pic","sort","remark","labelIds","spuIdList"]
    }

    EditCategory invoke(TestContext testContext) {
        super.invoke(testContext)
        return this
    }

    EditCategory preInvoke(TestContext testContext){
        super.preInvoke(testContext)
        return this
    }

    EditCategory baseAssert(TestContext testContext){
        super.baseAssert(testContext)
        return this
    }



}
