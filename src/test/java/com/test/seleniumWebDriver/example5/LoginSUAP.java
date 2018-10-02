package com.test.seleniumWebDriver.example5;

import com.test.seleniumWebDriver.example4.User;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class LoginSUAP {

    private static WebDriver driver;

    public LoginSUAP() {
    }

    @BeforeClass
    public static void setUpClass() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void login() {
        driver.get("https://suap.ifpb.edu.br");

        driver.findElement(By.name("username")).sendKeys(User.getUsername());
        driver.findElement(By.name("password")).sendKeys(User.getPassword());
        driver.findElement(By.tagName("form")).submit();

        assertEquals("- SUAP: Sistema Unificado de Administração Pública",
                driver.getTitle());

    }

}
