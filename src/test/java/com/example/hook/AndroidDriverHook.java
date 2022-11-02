package com.example.hook;

import com.example.app.drivers.AndroidDriversInit;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AndroidDriverHook {
    @Before
    public void before() {
        AndroidDriversInit.initialization();
    }

    @After
    public void after() {
        AndroidDriversInit.close();
    }
}
