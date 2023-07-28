package com.meiji.biz.api

import com.miyuan.ifat.support.factory.FactorySupport
import groovy.sql.Sql

class MysqlAPI {
    @Lazy
    static Sql meiji_goods = FactorySupport.createSql("meiji-goods")
    @Lazy
    static Sql meiji_shop = FactorySupport.createSql("meiji_shop")
    @Lazy
    static Sql meiji_dealer = FactorySupport.createSql("meiji_dealer")
    @Lazy
    static Sql meiji_user = FactorySupport.createSql("meiji_user")
    @Lazy
    static Sql meiji_excel = FactorySupport.createSql("meiji_excel")
    @Lazy
    static Sql meiji_order = FactorySupport.createSql("meiji_order")
    @Lazy
    static Sql meiji_pay = FactorySupport.createSql("meiji_pay")
    @Lazy
    static Sql meiji_settlement = FactorySupport.createSql("meiji_settlement")
    @Lazy
    static Sql meiji_stock = FactorySupport.createSql("meiji_stock")
    @Lazy
    static Sql meiji_product = FactorySupport.createSql("meiji_product")
    @Lazy
    static Sql meiji_supplier = FactorySupport.createSql("meiji_supplier")
    @Lazy
    static Sql meiji_message = FactorySupport.createSql("meiji_message")
    @Lazy
    static Sql meiji_active = FactorySupport.createSql("meiji_active")
    @Lazy
    static Sql meiji_integral = FactorySupport.createSql("meiji_integral")
    @Lazy
    static Sql meiji_content = FactorySupport.createSql("meiji_content")
    @Lazy
    static Sql huangfeng_oils = FactorySupport.createSql("huangfeng_oils")
    @Lazy
    static Sql huangfeng_auth = FactorySupport.createSql("huangfeng_auth")
    @Lazy
    static Sql huangfeng_system = FactorySupport.createSql("huangfeng_system")
}
