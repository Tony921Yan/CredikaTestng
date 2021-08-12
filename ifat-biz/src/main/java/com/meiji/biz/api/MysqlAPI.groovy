package com.meiji.biz.api

import com.miyuan.ifat.support.factory.FactorySupport
import groovy.sql.Sql

class MysqlAPI {
    @Lazy
    static Sql platformGoodsSql = FactorySupport.createSql("mysql-platform-goods")
    static Sql prod_meiji_shop = FactorySupport.createSql("meiji_shop")
    static Sql prod_meiji_dealer = FactorySupport.createSql("meiji_dealer")
    static Sql prod_meiji_user = FactorySupport.createSql("meiji_user")
    static Sql prod_meiji_excel = FactorySupport.createSql("meiji_excel")
    static Sql prod_meiji_order = FactorySupport.createSql("meiji_order")
    static Sql prod_meiji_pay = FactorySupport.createSql("meiji_pay")
    static Sql prod_meiji_settlement = FactorySupport.createSql("meiji_settlement")
    static Sql prod_meiji_stock = FactorySupport.createSql("meiji_stock")
    static Sql prod_meiji_product = FactorySupport.createSql("meiji_product")
    static Sql prod_meiji_supplier = FactorySupport.createSql("meiji_supplier")
    static Sql prod_meiji_message = FactorySupport.createSql("meiji_message")
//    static Sql prod_meiji_office_account = FactorySupport.createSql("meiji_office_account")
    static Sql prod_meiji_active = FactorySupport.createSql("meiji_active")
}
