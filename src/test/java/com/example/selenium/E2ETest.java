package com.example.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class E2ETest {
    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach()
    void setupTest() {
        driver = new FirefoxDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void Test() {
        driver.get("http://www.google.com");
    }
}
