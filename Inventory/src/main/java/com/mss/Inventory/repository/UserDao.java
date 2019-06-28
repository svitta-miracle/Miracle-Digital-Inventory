package com.mss.Inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mss.Inventory.entity.Users;

@Repository
public interface UserDao extends MongoRepository<Users,String> {

}
