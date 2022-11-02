package com.example.app.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.example.app.drivers.AndroidDriversInit.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class BasePageObject {
    public AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

    public WebDriverWait onWait() {
        return new WebDriverWait(getDriver(), 30, 1000);
    }

    public AndroidElement find(By locator) {
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click(By locator) {
        AndroidElement el = find(locator);
        el.click();
    }

    public void inputText(By locator, String input) {
        AndroidElement el = find(locator);
        el.sendKeys(input);
    }

    public void isDisplayed(By locator) {
        AndroidElement el = find(locator);
        assertThat(el.isDisplayed());
    }

    public String getText(By locator) {
        AndroidElement el = find(locator);
        return el.getText();
    }

    public void clear(By locator) {
        find(locator).clear();
    }

    public void scrollAndClickBytext(String visibleText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))");
    }
}
