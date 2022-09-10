package com.mayank.service;

import com.mayank.data.UserDao;
import com.mayank.model.Resturant;
import com.mayank.model.Review;

import java.util.List;

public class ResturantService {
    private static ResturantService resturantService = null;
    private ResturantService(){}
    public static ResturantService getInstance(){
        if(resturantService == null){
            resturantService = new ResturantService();
        }
        return resturantService;
    }

    UserDao userDao = UserDao.getInstance();

    public Resturant registerResturant(String name, String pinCodes, String item, int quantity, int price){
        if(price < 0 || quantity < 0){
            System.out.println("Invalid price or Quantity");
            return null;
        } else if(name.isEmpty() || item.isEmpty()){
            System.out.println("Invalid value for name or item");
            return null;
        }
        return userDao.registerResturant(name, pinCodes, item, quantity, price);
    }

    public Review rateResturant(String name, Integer rating, String comment){
        if(rating == null || rating <= 0 || rating > 5){
            System.out.println("Invalid rating");
            return null;
        }
        return userDao.rateResturant(name, rating, comment);
    }

    public Resturant updateQuantity(String name, int quantity){
        if(quantity<=0){
            System.out.println("Invalid Quantity");
            return null;
        }
        return userDao.updateQuantity(name, quantity);
    }

    public List<Resturant> showResturant(String sortBy){
        return userDao.showResturant(sortBy);
    }

}
