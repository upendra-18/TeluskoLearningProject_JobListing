package com.TLP.joblisting.repository;

import com.TLP.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
    // MongoRepository will take care of all the CRUD operations, we don't have to implement any class / methods.
}
