package com.ccristian.springboot.springmvc.app.services;

import com.ccristian.springboot.springmvc.app.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> finById(Long id);
    User save(User user);
    void remove (Long id);
}
