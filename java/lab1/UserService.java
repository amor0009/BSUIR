package com.example.test.service;

import com.example.test.model.User;


import java.util.List;


public interface UserService {
    List<User> findAllUsers();
    String saveUser(User user);
    User findUserByNameOfAccount(String nameOfAccount);
    String updateUser(User user);
    String deleteUser(String nameOfAccount);
}
