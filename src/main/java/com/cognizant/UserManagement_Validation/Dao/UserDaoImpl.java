package com.cognizant.UserManagement_Validation.Dao;

import com.cognizant.UserManagement_Validation.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    private List<User> users = new ArrayList<>();
    private int nextUserId = 1;

    @Override
    public void addUser(User user) {
        user.setUserId(nextUserId++);
        users.add(user);
    }

    @Override
    public User save(User user) {
        if (user.getUserId() == 0) {
            user.setUserId(nextUserId++);
        }
        users.add(user);
        return user;
    }

    @Override
    public User findById(int userId) {
        return users.stream().filter(user -> user.getUserId() == userId).findFirst().orElse(null);
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void deleteUserById(int userId) {
        users.removeIf(user -> user.getUserId() == userId);
    }


    @Override
    public User getUserById(int userId) {
        for(User user : users) {
            if(user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }
}
