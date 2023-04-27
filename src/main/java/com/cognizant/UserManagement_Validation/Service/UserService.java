package com.cognizant.UserManagement_Validation.Service;

import com.cognizant.UserManagement_Validation.Model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    User getUserById(int userId) throws Exception;
    List<User> getAllUsers();
    User updateUser(User user);
    boolean deleteUserById(int userId);
}
