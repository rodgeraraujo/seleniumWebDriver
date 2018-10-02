package com.test.seleniumWebDriver.example1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class TesteLogoGoogle {

    //Cria uma variável do tipo WebDriver
    private static WebDriver driver;

    public TesteLogoGoogle() {
    }

    @Before
    public  void Conectar() {

        //Editando as propeiedades da localização do driver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //Inicializando a váriável
        driver = new ChromeDriver();

    }

    @After
    public  void Encerrar() {
        driver.close();
    }


    @Test
    public void testeLogoGoogle() {

        //Acessar a página do google
        driver.get("https://www.google.com.br/");

        //Encontrando elemento pelo Id
        WebElement logo = driver.findElement(By.id("hplogo"));

        //Verificando se o logo da google está visivel no display
        assertTrue(logo.isDisplayed());
    }
}
