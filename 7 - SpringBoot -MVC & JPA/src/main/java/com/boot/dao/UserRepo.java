package com.boot.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.entity.User;

public interface UserRepo extends CrudRepository<User,Integer>{

}
