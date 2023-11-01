package acme.demotools;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Test {
    WebDriver driver;
    Base base = new Base(driver);



    By tittleForm = By.className("auth-header");

    /*variables del page login
    By usernameFieldId = By.id("username");
    By passwordFieldId = By.id("password");
    By signInBtm = By.id("log-in");*/

    //Pagina de inicio de usuario

    By nameAccountXpath = By.xpath("/html/body/div/div[3]/div[1]/div/div/div[2]/div[1]");
    @Before

    public void setUp(){
        driver= new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","./src/driver/chromedriver.exe");
        driver.get("https://demo.applitools.com");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @org.junit.Test
    public void testPage(){
        assertEquals(driver.findElement(tittleForm).getText(),"Login Form");
    }

    @org.junit.Test
    public void loginUser1(){
        PageLogin pageLogin = new PageLogin(driver);
        PageUserPanel pageUserPanel = new PageUserPanel(driver);
        pageLogin.userLoginUp("LordFede","dalemamacontutacata");
        pageUserPanel.visualUserName();
    }

    @org.junit.Test
    public void loginUser2(){
        PageLogin pageLogin = new PageLogin(driver);
        PageUserPanel pageUserPanel = new PageUserPanel(driver);
        pageLogin.userLoginUp("usernmae","password");
        pageUserPanel.visualUserName();
    }
}
