package com.test.seleniumWebDriver.example4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroMercadoLivre {

    private static WebDriver driver;
    
    public CadastroMercadoLivre() {

    }
    
    @Before
    public  void setUpClass() {

        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        driver = new FirefoxDriver();

    }
    
    @After
    public  void tearDownClass() {

        driver.close();

    }

     @Test
     public void testeCadastro() {

         driver.get("https://www.mercadolivre.com.br/");
         
         WebElement btCadastro = driver.findElement(By.xpath("//*[@id=\"nav-header-menu\"]/a[1]"));
         btCadastro.click();

         WebElement nome = driver.findElement(By.id("signupFirstName"));
         nome.sendKeys("teste");

         WebElement sobrenome = driver.findElement(By.id("signupLastName"));
         sobrenome.sendKeys("selenium");

         WebElement email = driver.findElement(By.id("signupEmail"));
         email.sendKeys("selinumteste8@gmail.com");

         WebElement senha = driver.findElement(By.id("signupPassword"));
         senha.sendKeys("teste010203");
         
         WebElement entrar = driver.findElement(By.xpath("//*[@id=\"signup\"]/div/div[2]/button"));
         entrar.click();
         
         String aviso = (driver.findElement(By.xpath("//*[@id=\"use-other-email-modal\"]/div[1]/div/div/div[2]/h3")).getText());
         System.out.println(aviso);
         assertEquals(aviso,"Você já fez um cadastro com selinumteste8@gmail.com.");
         
     }
}
