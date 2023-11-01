package parabank.parasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountPage {
    WebDriver driver;
    By welcomeMessageClass = By.className("title");


    public AccountPage(WebDriver driver){
        this.driver=driver;
    }

    public void confirmRegisterSuccessful(String user){
        assertEquals(driver.findElement(welcomeMessageClass).getText(),"Welcome "+user);
    }
}
