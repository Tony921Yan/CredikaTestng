package com.meiji.biz.request.http.mall.userShop

import com.meiji.biz.request.http.mall.MallPost
import com.miyuan.ifat.support.test.TestContext

/**
 *
 @author s1mple
 @create 2021/8/4-10:48
 */
class UserVisitShop extends MallPost{
    {
        super.api = "/mall/user/shop/userVisitShop"
        super.params=["id"]
    }
    @Override
    Object invokeMethod(String name, Object args) {
        return super.invokeMethod(name, args)
    }

    @Override
    Object getProperty(String propertyName) {
        return super.getProperty(propertyName)
    }

    @Override
    void setProperty(String propertyName, Object newValue) {
        super.setProperty(propertyName, newValue)
    }

    @Override
    void setMetaClass(MetaClass metaClass) {
        super.setMetaClass(metaClass)
    }

    @Override
    MallPost invoke(TestContext testContext) {
        return super.invoke(testContext)
    }

    @Override
    MallPost preInvoke(TestContext testContext) {
        return super.preInvoke(testContext)
    }

    @Override
    MallPost afterInvoke(TestContext testContext) {
        return super.afterInvoke(testContext)
    }

    @Override
    MallPost baseAssert(TestContext testContext) {
        return super.baseAssert(testContext)
    }

    @Override
    MallPost specialAssert(TestContext testContext) {
        return super.specialAssert(testContext)
    }
}
