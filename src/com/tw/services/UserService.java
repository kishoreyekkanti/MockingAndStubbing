package com.tw.services;

import com.tw.dao.UserDao;
import com.tw.models.*;

import java.util.ArrayList;
import java.util.List;


public class UserService {
    UserDao userDao = new UserDao();
    public List<User> fetchActiveUsers(){
        List<User> filteredUsers = new ArrayList<User>();

        List<User> users = userDao.fetchUsers();
        for (User user : users) {
           if(user.getStatus().equals("active")){
               filteredUsers.add(user);
           }
        }
        return filteredUsers;
    }

    //mail active users. Assume there's a mailerUtil.sendMail(User user)
}

