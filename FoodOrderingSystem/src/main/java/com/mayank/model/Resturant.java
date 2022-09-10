package com.mayank.model;

import java.util.List;

public class Resturant {
    private int id;
    private String name;
    private String item;
    private int price;
    private List<Long> serviceablePincodes;
    private int quantity;
    private Float rating;
    private List<Review> reviews;

    public Resturant(int id, String name, String item, int price, List<Long> serviceablePincodes, int quantity) {
        this.id = id;
        this.name = name;
        this.item = item;
        this.price = price;
        this.serviceablePincodes = serviceablePincodes;
        this.quantity = quantity;
        //this.rating = rating;
        //this.reviews = reviews;
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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Long> getServiceablePincodes() {
        return serviceablePincodes;
    }

    public void setServiceablePincodes(List<Long> serviceablePincodes) {
        this.serviceablePincodes = serviceablePincodes;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
