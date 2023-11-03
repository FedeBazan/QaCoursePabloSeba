package demoblaze.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomePage {
    private WebDriver driver;
    Helper helper = new Helper(driver);
    By homeBtm = By.linkText("Home\n(current)");
    By HomeBtm2 = By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a");
    By signInBtomId = By.id("signin2");
    By signInUsernameId = By.id("sign-username");
    By signInPasswordId = By.id("sign-password");
    By signUpBtmXpath = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By loginUsernameId = By.id("loginusername");
    By loginPasswordId = By.id("loginpassword");
    By loginBtmXpath = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By userWelcomeMsgId = By.id("nameofuser");
    private String user = helper.generateRandomString();
    private String pass = helper.generateRandomString();

    By logInBtmId = By.id("login2");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public void isDisplayedHome (){
        //System.out.println(driver.findElement(HomeBtm2).getText());
        assertTrue(driver.findElement(homeBtm).isDisplayed());
    }

    public void registerUserUp() throws InterruptedException {
        driver.findElement(signInBtomId).click();
        Thread.sleep(3_000);
        driver.findElement(signInUsernameId).sendKeys(user);
        driver.findElement(signInPasswordId).sendKeys(pass);
        driver.findElement(signUpBtmXpath).click();
        Thread.sleep(3_000);
        assertEquals("Sign up successful.",driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }

    public void loginUserUp() throws InterruptedException {
        driver.findElement(logInBtmId).click();
        Thread.sleep(5_000);
        driver.findElement(loginUsernameId).sendKeys(user);
        driver.findElement(loginPasswordId).sendKeys(pass);
        Thread.sleep(5_000);
        driver.findElement(loginBtmXpath).click();
        Thread.sleep(5_000);
        assertEquals("Welcome "+user,driver.findElement(userWelcomeMsgId).getText());
    }

    }
