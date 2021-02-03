package com.miyuan.api

import com.miyuan.factory.FactorySupport
import com.mongodb.client.MongoDatabase

class MongoAPI {
    @Lazy
    static MongoDatabase mongoDatabase = FactorySupport.createMongoCollection("mongo-miyuan")
}
