package com.example.cqrstutorial

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SensingDataRepository : MongoRepository<SensingData, String> {
}
