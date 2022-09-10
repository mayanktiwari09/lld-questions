package com.mayank.model;

public class Order {
    private int id;
    private int resturantId;
    private int userId;
    private int quantity;
    private String item;
    private Long timeStamp;
    private Long cost;

    public Order(int id, int resturantId, int userId, int quantity, String item, Long timeStamp, Long cost) {
        this.id = id;
        this.resturantId = resturantId;
        this.userId = userId;
        this.quantity = quantity;
        this.item = item;
        this.timeStamp = timeStamp;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResturantId() {
        return resturantId;
    }

    public void setResturantId(int resturantId) {
        this.resturantId = resturantId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
}
