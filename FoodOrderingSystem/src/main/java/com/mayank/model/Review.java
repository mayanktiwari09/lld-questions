package com.mayank.model;

public class Review {
    private int id;
    private int score;
    private String comment;

    public Review(int id, int score, String comment) {
        this.id = id;
        this.score = score;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
