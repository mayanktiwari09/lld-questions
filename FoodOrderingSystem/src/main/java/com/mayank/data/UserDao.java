package com.mayank.data;

import com.mayank.constants.Gender;
import com.mayank.model.Order;
import com.mayank.model.Resturant;
import com.mayank.model.Review;
import com.mayank.model.User;
import com.mayank.util.IDGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UserDao {
    private static UserDao instance = null;
    private UserDao(){}
    public static UserDao getInstance(){
        if(instance == null){
            instance = new UserDao();
        }
        return instance;
    }

    private HashMap<Integer, User> userHashMap = new HashMap<Integer,User>();
    private HashMap<Long, Integer> phoneNumberMap = new HashMap<Long,Integer>();
    private HashMap<String,Resturant> resturantNameMap = new HashMap<String,Resturant>();

    private User loggedInUser = null;

    public User registerUser(Long phone, String name, Long pinCode, Gender gender){
        if(phoneNumberMap.containsKey(phone)){
            User user = userHashMap.get(phoneNumberMap.get(phone));
            System.out.println("User already exists in records");
            return user;
        }
        User user = new User(IDGenerator.getId(), phone, name, pinCode, gender);
        phoneNumberMap.put(phone,user.getId());
        userHashMap.put(user.getId(),user);
        System.out.println("User registered");

        return user;
    }

    public Resturant registerResturant(String name, String pinCodes, String item, int quantity, int price){
        if(loggedInUser == null){
            System.out.println("No logged in user");
            return null;
        }
        if (resturantNameMap.containsKey(name)){
            System.out.println("Resturant already exists");
            return null;
        }
        List<String> pinCodeList = Arrays.asList(pinCodes.split(","));
        List<Long> pins = new ArrayList<>();
        if(!pinCodes.isEmpty()){
            for (String s : pinCodeList) {
                if(!s.chars().allMatch(Character::isDigit)){
                    System.out.println("Invalid PinCodes");
                    return null;
                }
                pins.add(Long.parseLong(s));
            }
        }
        Resturant resturant = new Resturant(IDGenerator.getId(),name,item,price,pins,quantity);
        resturantNameMap.put(name,resturant);
        loggedInUser.getResturants().add(resturant);
        System.out.println("Resturant Registered");
        return resturant;
    }

    public Review rateResturant(String name, Integer rating, String comment){
        return null;
    }

    public Resturant updateQuantity(String name, int quantity){
        return null;
    }

    public List<Resturant> showResturant(String sortBy){
        return null;
    }

    public Order placeOrder(String name, Integer quantity){
        return null;
    }

    public User login(Long phone){
        if(!phoneNumberMap.containsKey(phone)){
            System.out.println("User does not exists");
            return null;
        }
        User user = userHashMap.get(phoneNumberMap.get(phone));
        loggedInUser = user;
        System.out.println("User logged in complete");
        return user;
    }

    public List<Order> listOrders(){
        return null;
    }
}
