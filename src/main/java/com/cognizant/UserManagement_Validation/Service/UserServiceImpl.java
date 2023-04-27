package com.cognizant.UserManagement_Validation.Service;

import com.cognizant.UserManagement_Validation.Dao.UserDao;
import com.cognizant.UserManagement_Validation.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService{

    @Autowired UserDao userDao;
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUserById(int userId) throws Exception {
        User user =userDao.findById(userId);
        if(user == null) {
            throw new Exception("User not found with id : " + userId);
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userDao.save(user);
    }

    @Override
    public boolean deleteUserById(int userId) {
        userDao.deleteUserById(userId);
        return false;
    }
}
