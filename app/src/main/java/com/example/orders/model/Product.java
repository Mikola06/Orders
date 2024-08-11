package com.example.orders.model;

public class Product {

    int id;
    String img, title, color, text, price, img_vertical;

    public Product(int id, String img, String title, String color, String text, String price, String img_vertical) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.color = color;
        this.text = text;
        this.price = price;
        this.img_vertical = img_vertical;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImg_vertical() {
        return img_vertical;
    }

    public void setImg_vertical(String img_vertical) {
        this.img_vertical = img_vertical;
    }

}
