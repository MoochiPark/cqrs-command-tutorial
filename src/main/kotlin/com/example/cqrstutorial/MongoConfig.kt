//package com.example.cqrstutorial
//
//import com.mongodb.ConnectionString
//import com.mongodb.MongoClientSettings
//import com.mongodb.client.MongoClient
//import com.mongodb.client.MongoClients
//import java.util.Collections
//import org.springframework.context.annotation.Configuration
//import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
//
//@Configuration
//class MongoConfig : AbstractMongoClientConfiguration() {
//    override fun getDatabaseName(): String = "test"
//
//    override fun mongoClient(): MongoClient {
//        val connectionString = ConnectionString("mongodb://admin:admin@localhost:27017/test?authSource=admin")
//
//        val mongoClientSettings = MongoClientSettings
//            .builder()
//            .applyConnectionString(connectionString)
//            .build()
//
//        return MongoClients.create(mongoClientSettings)
//    }
//
//    override fun getMappingBasePackages(): MutableCollection<String> {
//        return Collections.singleton("com.example.cqrstutorial")
//    }
//}
