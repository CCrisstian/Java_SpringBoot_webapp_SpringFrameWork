package com.ccristian.springboot.springmvc.app.repositories;

import com.ccristian.springboot.springmvc.app.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
