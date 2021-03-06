package com.meiji.api

import com.meiji.factory.FactorySupport
import groovy.sql.Sql

class MysqlAPI {
    @Lazy
    static Sql platformGoodsSql = FactorySupport.createSql("mysql-platform-goods")
}
