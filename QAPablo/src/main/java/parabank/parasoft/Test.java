package parabank.parasoft;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Test {
    WebDriver driver;
    PrincipalPage principalPage;
    RegisterPage registerPage;
    /*vartables pagina de inicio
    By principalImage = By.xpath("//*[@id='topPanel']/a[2]/img");*/

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","./src/driver/chromedriver.exe");
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }
    @After
    public void tearDown(){
        driver.close();
    }
    @org.junit.Test
    public void testUp(){
        principalPage = new PrincipalPage(driver);
        principalPage.isDisplayedPrincipalImage();
    }

    @org.junit.Test
    public void registerUserUp(){
        principalPage = new PrincipalPage(driver);
        registerPage = new RegisterPage(driver);
        principalPage.registerUser();
        registerPage.isDisplayedTittleFormRegister();
        registerPage.registerUser("fede",
                "bazan",
                "Independecia 2040");
    }
}
