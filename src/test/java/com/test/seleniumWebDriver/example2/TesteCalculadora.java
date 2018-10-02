package com.test.seleniumWebDriver.example2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCalculadora {

    //Declara uma variavel statica do tipo "WebDriver"
    private static WebDriver driver;

    public TesteCalculadora() {
    }

    @BeforeClass
    public static void Conectar() {

        //Especificando tipo e caminho do driver
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        //Instanciando o driver de conexão
        driver = new FirefoxDriver();

    }

    @AfterClass
    public static void Encerrar() {
//        driver.close();
    }

    @Test
    public void testeSoma() {

        //Passando endereço para acessar o site
        driver.get("https://web2.0calc.com/");
        WebElement numero5 = driver.findElement(By.id("Btn5"));
        numero5.click();
        WebElement soma = driver.findElement(By.id("BtnPlus"));
        soma.click();
        WebElement numero3 = driver.findElement(By.id("Btn3"));
        numero3.click();
        WebElement igualdade = driver.findElement(By.id("BtnCalc"));
        igualdade.click();
        String esperado = "8";
        //String atual = driver.findElement(By.xpath("//input[@id='input']")).getAttribute("value");
        String atual = driver.findElement(By.id("input")).getAttribute("value");
        assertEquals(atual, esperado);

    }
}
