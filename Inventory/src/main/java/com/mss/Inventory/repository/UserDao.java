package com.mss.Inventory.repository;

import org.springframework.stereotype.Repository;

import com.mss.Inventory.entity.Users;

@Repository
public class UserDao extends MongoRepository<Users,Integer> {
	
	

}
