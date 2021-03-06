package com.meiji.request.http

import com.meiji.factory.FactorySupport
import groovy.sql.Sql

class MysqlAPI {
    @Lazy
    static Sql miyuanSql = FactorySupport.createSql("mysql-miyuan")
    @Lazy
    static Sql miyuanOrderSql = FactorySupport.createSql("miyuan-order")
    @Lazy
    static Sql miyuanOrderShard0Sql = FactorySupport.createSql("miyuan-order-shard-0")
    @Lazy
    static Sql miyuanOrderShard1Sql = FactorySupport.createSql("miyuan-order-shard-1")
    @Lazy
    static Sql miyuanOrderShard2Sql = FactorySupport.createSql("miyuan-order-shard-2")
    @Lazy
    static Sql miyuanOrderShard3Sql = FactorySupport.createSql("miyuan-order-shard-3")

    static Sql getOrderShardSql(Integer userId){
        Integer shard = userId%4
        switch (shard){
            case 0:
                return miyuanOrderShard0Sql
                break;
            case 1:
                return miyuanOrderShard1Sql
                break;
            case 2:
                return miyuanOrderShard2Sql
                break;
            case 3:
                return miyuanOrderShard3Sql
                break;
            default:
                return null;
        }
    }

}
