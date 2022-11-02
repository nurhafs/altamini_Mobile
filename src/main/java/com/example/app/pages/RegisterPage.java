package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class RegisterPage extends BasePageObject {
    private By productsHeader = MobileBy.AccessibilityId("Products");

    private By registerHeader = By.xpath("//android.view.View[@content-desc=\"Register\"]");

    private By fullnameField = By.xpath("//android.view.View/android.widget.EditText[1]");

    private By emailField = By.xpath("//android.view.View/android.widget.EditText[2]");

    private By loginIcon = By.xpath("//android.view.View/android.view.View[1]/android.widget.Button");

    private By registerLink = MobileBy.AccessibilityId("Register");

    private By passwordField = By.xpath("//android.view.View/android.widget.EditText[3]");

    private By registerBtn = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");

    private By failed = MobileBy.AccessibilityId("Gagal :(");

    private By emailEmpty = MobileBy.AccessibilityId("email can not empty");

    private By passwordEmpty = MobileBy.AccessibilityId("password can not empty");

    private By fullnameEmpty = MobileBy.AccessibilityId("fullname can not empty");
    public void displayed() { isDisplayed(registerHeader); }

    public void mainPagedisplayed() {
        isDisplayed(productsHeader);
    }

    public void clickRegisterLink() { click(registerLink); }

    public void clickLoginIcon() { click(loginIcon); }

    public void fillFullname(String fullname) {
        click(fullnameField);
        inputText(fullnameField, fullname);
    }

    public void fillEmail(String email) {
        click(emailField);
        inputText(emailField, email);
    }

    public void fillPassword(String pass) {
        click(passwordField);
        inputText(passwordField, pass);
    }

    public void clickRegisterBtn() {
        click(registerBtn);
    }

    public void failedError() {
        isDisplayed(failed);
    }

    public void emailEmptyError() {
        isDisplayed(emailEmpty);
    }

    public void passwordEmptyError() { isDisplayed(passwordEmpty); }

    public void fullnameEmptyError() { isDisplayed(fullnameEmpty); }

}
