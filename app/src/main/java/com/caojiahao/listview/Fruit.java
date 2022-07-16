package com.caojiahao.listview;

/**
 * @Description: java类作用描述
 * @author: caojiahao
 * @date: 2022/7/16
 */
public class Fruit {
    private final int imageID;
    private final String name;
    private final String price;
    public int getImageID() {
        return imageID;
    }
    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public Fruit(int imageID, String name, String price) {
        this.imageID = imageID;
        this.name = name;
        this.price = price;
    }
}
