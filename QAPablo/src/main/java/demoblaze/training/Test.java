package demoblaze.training;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setUp(){
        driver= new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","./src/driver/chromedriver.exe");
        driver.get("https://www.demoblaze.com");
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @org.junit.Test
    public void testUp(){
        homePage = new HomePage(driver);
        homePage.isDisplayedHome();
    }

    @org.junit.Test
    public void registerUserUp() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.registerUserUp();
    }

    @org.junit.Test
    public void loginUserUp() throws InterruptedException {
        homePage = new HomePage(driver);
        registerUserUp();
        homePage.loginUserUp();
    }
}
