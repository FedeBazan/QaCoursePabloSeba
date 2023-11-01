package acme.demotools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class PageUserPanel {
    WebDriver driver;
    By nameAccountXpath = By.xpath("/html/body/div/div[3]/div[1]/div/div/div[2]/div[1]");
    public PageUserPanel(WebDriver driver){
        this.driver=driver;
    }

    public void visualUserName (){
        assertTrue(driver.findElement(nameAccountXpath).isDisplayed());
    }
}
