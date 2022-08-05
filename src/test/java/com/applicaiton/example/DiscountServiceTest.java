package com.applicaiton.example;

import com.application.example.DiscountService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class DiscountServiceTest {

    private DiscountService discountService;
    private String percentage ="";

    @Given("^Execute DiscountService business$")
    public void execute (){
        discountService = new DiscountService();
    }

    @When("^I will enter (\\d+)$")
    public void calculateDiscount (Integer amount){
        this.percentage = this.discountService.getDiscount(amount);
    }

    @Then("We should get {int}% discount")
    public void weShouldGetDiscount() {

    }


    @Then("We should get ten percent discount")
    public void weShouldGetTenPercentDiscount() {
        Assert.assertEquals("10%" , percentage);
    }

    @Then("We should get fifteen percent discount")
    public void weShouldGetFifteenPercentDiscount() {
        Assert.assertEquals("15%" , percentage);
    }

}
