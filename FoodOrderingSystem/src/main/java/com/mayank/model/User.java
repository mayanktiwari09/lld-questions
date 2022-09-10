package com.mayank.model;

import com.mayank.constants.Gender;

import java.util.List;

public class User {
    private int id;
    private String name;
    private Long phone;
    private Gender gender;
    private Long pincode;
    private List<Resturant> resturants;
    private List<Order> orders;

    public User(int id, Long phone, String name, Long pincode, Gender gender){
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.pincode = pincode;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public List<Resturant> getResturants() {
        return resturants;
    }

    public void setResturants(List<Resturant> resturants) {
        this.resturants = resturants;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
