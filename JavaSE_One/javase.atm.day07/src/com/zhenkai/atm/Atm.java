package com.zhenkai.atm;

/**
 * @author Zhenkai
 * @date 2026/4/17 周五
 * @description ATM 系统的数据存放
 **/
public class Atm {
    private String userName;
    private char gender;
    private String passWord;
    private String cardId;
    private double money;
    // 限额
    private double limit;

    public Atm() {
    }

    public Atm(String userName, char gender, String passWord, String cardId, double money, double limit) {
        this.userName = userName;
        this.gender = gender;
        this.passWord = passWord;
        this.cardId = cardId;
        this.money = money;
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName + (gender == '男' ? "先生" : "女士");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
