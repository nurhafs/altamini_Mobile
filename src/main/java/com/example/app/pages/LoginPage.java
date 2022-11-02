package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {
    private By loginHeader = By.xpath("//android.view.View[@content-desc=\"Login\"]");

    private By loginIcon = By.xpath("//android.view.View/android.view.View[1]/android.widget.Button");

    private By loginBtn = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");

    private By emailField = By.xpath("//android.view.View/android.widget.EditText[1]");

    private By passwordField = By.xpath("//android.view.View/android.widget.EditText[2]");

    private By emailEmpty = MobileBy.AccessibilityId("email can not empty");

    private By passwordEmpty = MobileBy.AccessibilityId("password can not empty");

    private By invalidPopUp = MobileBy.AccessibilityId("Email atau password tidak valid.");
    public void openLoginPage() { click(loginIcon); }

    public void displayed() { isDisplayed(loginHeader); }

    public void clickLoginBtn() { click(loginBtn); }

    public void fillEmail(String email) {
        click(emailField);
        inputText(emailField, email);
    }

    public void fillPassword(String pass) {
        click(passwordField);
        inputText(passwordField, pass);
    }

    public void emailEmptyError() {
        isDisplayed(emailEmpty);
    }

    public void passwordEmptyError() { isDisplayed(passwordEmpty); }

    public void invalidError() { isDisplayed(invalidPopUp); }

}
