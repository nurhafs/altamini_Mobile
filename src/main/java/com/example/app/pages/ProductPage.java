package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class ProductPage extends BasePageObject {
    private By productsHeader = MobileBy.AccessibilityId("Products");

    private By buyBtn = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");

    private By loginIcon = By.xpath("//android.view.View/android.view.View[1]/android.widget.Button");

    private By cartQty;

    public void displayed() {
        isDisplayed(productsHeader);
    }

    public void clickBuy() {
        click(buyBtn);
    }

    public void openLoginPage() {
        click(loginIcon);
    }

    public void checkCartQty(int num) {
        String id = Integer.toString(num);
        cartQty = MobileBy.AccessibilityId(id);
        isDisplayed(cartQty);
    }

}
