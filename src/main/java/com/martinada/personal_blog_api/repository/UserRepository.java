package com.martinada.personal_blog_api.repository;

import com.martinada.personal_blog_api.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends MongoRepository<User, String> {
}
