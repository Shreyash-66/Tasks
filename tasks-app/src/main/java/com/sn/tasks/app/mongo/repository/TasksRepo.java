package com.sn.tasks.app.mongo.repository;

import com.sn.tasks.app.mongo.model.Tasks;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepo extends MongoRepository<Tasks, String> {
}
