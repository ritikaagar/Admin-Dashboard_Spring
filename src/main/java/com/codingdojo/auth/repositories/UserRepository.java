package com.codingdojo.auth.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.auth.models.User;

// imports removed for brevity

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}