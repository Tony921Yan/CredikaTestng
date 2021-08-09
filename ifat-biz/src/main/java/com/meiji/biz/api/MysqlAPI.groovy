package com.meiji.biz.api

import com.miyuan.ifat.support.factory.FactorySupport
import groovy.sql.Sql

class MysqlAPI {
    @Lazy
    static Sql platformGoodsSql = FactorySupport.createSql("mysql-platform-goods")
    static Sql prod_meiji_shop = FactorySupport.createSql("meiji_shop")
}
