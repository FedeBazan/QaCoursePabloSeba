package parabank.parasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class PrincipalPage {
    private WebDriver driver;
    By principalImage = By.xpath("//*[@id='topPanel']/a[2]/img");
    By registerBtmLinkText = By.linkText("Register");


    public  PrincipalPage(WebDriver driver){
        this.driver = driver;
    }

    public void isDisplayedPrincipalImage(){
        assertTrue(driver.findElement(principalImage).isDisplayed());
    }

    public void registerUser(){
        driver.findElement(registerBtmLinkText).click();
    }
}
