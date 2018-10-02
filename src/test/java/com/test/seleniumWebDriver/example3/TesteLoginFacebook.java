package com.test.seleniumWebDriver.example3;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLoginFacebook {

    private static WebDriver driver;

    public TesteLoginFacebook() {
    }

    @BeforeClass
    public static void Conectar() {

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterClass
    public static void Encerrar() {

        //driver.close();
    }

    @Test
    public void testeLogin() {

        driver.get("https://pt-br.facebook.com/");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("seleniumteste8@gmail.com");

        WebElement senha = driver.findElement(By.id("pass"));
        senha.sendKeys("teste010203");

        driver.findElement(By.id("u_0_2")).submit();
        
        String atual = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span")).getText();
        
        assertEquals("Selenium",atual);

    }
}
