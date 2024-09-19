//package com.loginTest.stepDefinitions;
//
//import com.loginTest.pages.PharmaLogic;
//import com.loginTest.utils.DriverUtils;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//public class LoginSteps extends DriverUtils {
//    WebDriver driver = new ChromeDriver();
//    PharmaLogic pharmaLogic = new PharmaLogic(driver);
//
//    @Given("I am on the login page")
//    public void i_am_on_the_login_page() {
//        pharmaLogic.openLoginPage();
//    }
//
//    @When("I enter valid credentials")
//    public void i_enter_valid_credentials() {
//        pharmaLogic.enterEmail("hardstop-pharmacist6@mailinator.com");
//        pharmaLogic.enterPassword("Password1#");
//        pharmaLogic.clickSignIn();
//    }
//
//    @When("I enter an invalid password")
//    public void i_enter_an_invalid_password() {
//        pharmaLogic.enterEmail("hardstop-pharmacist6@mailinator.com");
//        pharmaLogic.enterPassword("Password");
//        pharmaLogic.clickSignIn();
//    }
//
//    @When("I enter an invalid email")
//    public void i_enter_an_invalid_email() {
//        pharmaLogic.enterEmail("hardstop-pharmacist6@mailinator.co");
//        pharmaLogic.enterPassword("Password1#");
//        pharmaLogic.clickSignIn();
//    }
//
//    @Then("I should be redirected to the dashboard")
//    public void i_should_be_redirected_to_the_dashboard() {
//        Assert.assertTrue(pharmaLogic.isDashboardDisplayed(), "Dashboard is not displayed");
//    }
//
//    @Then("I should see an error message {string}")
//    public void i_should_see_an_error_message(String expectedMessage) {
//        String actualMessage = pharmaLogic.getErrorMessage();
//        Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match");
//    }
//}


package com.loginTest.stepDefinitions;

import com.loginTest.pages.PharmaLogic;
import com.loginTest.utils.DriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps extends DriverUtils {
    WebDriver driver = new ChromeDriver();
    PharmaLogic pharmaLogic = new PharmaLogic(driver);

    @Given("^User on the login page$")
    public void user_on_the_login_page() {
        pharmaLogic.openLoginPage();
    }

    @When("^User login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_with_credentials(String email, String password) {
        pharmaLogic.enterEmail(email);
        pharmaLogic.enterPassword(password);
        pharmaLogic.clickSignIn();
    }

    @Then("^User should be redirected to the dashboard$")
    public void user_should_be_redirected_to_the_dashboard() {
        Assert.assertTrue(pharmaLogic.isDashboardDisplayed(), "Dashboard is not displayed");
    }

    @Then("^User should see an error message \"([^\"]*)\"$")
    public void user_should_see_an_error_message(String expectedMessage) {
        String actualMessage = pharmaLogic.getErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match");
    }
}