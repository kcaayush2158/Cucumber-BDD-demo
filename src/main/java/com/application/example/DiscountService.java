package com.application.example;

public class DiscountService {

  String discountPercentage = "";

    public String getDiscount(int amount){
        if(amount > 5000 && amount < 10000) {
            discountPercentage = "10%";
        }else{
            discountPercentage = "15%";
        }
        return discountPercentage;
    }
}
