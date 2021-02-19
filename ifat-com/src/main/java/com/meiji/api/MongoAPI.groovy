package com.meiji.api

import com.meiji.factory.FactorySupport
import com.mongodb.client.MongoDatabase

class MongoAPI {
    @Lazy
    static MongoDatabase mongoDatabase = FactorySupport.createMongoCollection("mongo-miyuan")
}
