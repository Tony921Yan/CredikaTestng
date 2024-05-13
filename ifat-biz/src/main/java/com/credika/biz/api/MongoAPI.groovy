package com.credika.biz.api

import com.miyuan.ifat.support.factory.FactorySupport
import com.mongodb.client.MongoDatabase

class MongoAPI {
    @Lazy
    static MongoDatabase mongoDatabase = FactorySupport.createMongoCollection("mongo-miyuan")
}
