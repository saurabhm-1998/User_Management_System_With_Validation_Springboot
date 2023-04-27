package com.cognizant.UserManagement_Validation.Dao;

import com.cognizant.UserManagement_Validation.Model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);
    User save(User user);
    User findById(int userId);
    List<User> findAll();
    void deleteUserById(int userId);
    User getUserById(int userId);

}
