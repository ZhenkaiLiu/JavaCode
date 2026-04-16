package com.zhenkai.arraylist.test;

/**
 * @author Zhenkai
 * @date 2026/4/16 周四
 * @description 食物类
 **/
public class Food {
    private String name;
    private String information;
    private double discount;
    // 原价
    private double originalPrice;
    // 优惠价
    private double discountedPrice;

    public Food(String name, String information, double discount, double originalPrice, double discountedPrice) {
        this.name = name;
        this.information = information;
        this.discount = discount;
        this.originalPrice = originalPrice;
        this.discountedPrice = discountedPrice;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
