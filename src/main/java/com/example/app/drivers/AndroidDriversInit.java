package com.example.app.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriversInit {
    public static AndroidDriver<AndroidElement> driver;

    public static void initialization() {
        DesiredCapabilities desc = new DesiredCapabilities();
        desc.setCapability("platformVersion", "11");
        desc.setCapability("platformName", "Android");
        desc.setCapability("automationName", "UiAutomator2");
        desc.setCapability("app", "C:\\Users\\ASUS\\Desktop\\stupen\\miniproject\\Mobile\\altaShopMobile\\src\\test\\resources\\application\\app-release.apk");

        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), desc);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void close() {
        driver.quit();
    }


}
