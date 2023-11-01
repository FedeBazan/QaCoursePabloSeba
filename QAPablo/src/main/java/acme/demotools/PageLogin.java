package acme.demotools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {

    private WebDriver driver ;

    By usernameFieldId = By.id("username");
    By passwordFieldId = By.id("password");
    By signInBtm = By.id("log-in");
    public PageLogin (WebDriver driver){
        this.driver = driver;
    }

    public void userLoginUp(String user,String pass){
        driver.findElement(usernameFieldId).sendKeys(user);
        driver.findElement(passwordFieldId).sendKeys(pass);
        driver.findElement(signInBtm).click();
    }
}
