package com.mayank.service;

import com.mayank.constants.Gender;
import com.mayank.data.UserDao;
import com.mayank.model.User;

public class UserService {
    private static UserService instance = null;
    private UserService(){}
    public static UserService getInstance(){
        if(instance == null){
            instance = new UserService();
        }
        return instance;
    }

    UserDao userDao = UserDao.getInstance();

    public User registerUser(Long phone, String name, Long pinCode, Gender gender){
        if(phone == null || phone < 0){
            System.out.println("Invalid Phone Number");
            return null;
        } else if(pinCode == null || pinCode < 0){
            System.out.println("Invalid PinCode");
            return null;
        } else if(name.isEmpty()){
            System.out.println("Invalid name");
            return null;
        }
        return userDao.registerUser(phone, name, pinCode, gender);
    }

    public User login(Long phone){
        return userDao.login(phone);
    }

}
