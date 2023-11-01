package acme.demotools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    private WebDriver driver;

    public Base (WebDriver driver){
        this.driver=driver;
    }

    public WebDriver chromeConnection() {
        System.setProperty("webdriver.chrome.driver","./src/driver/chromedriver.exe");
        driver= new ChromeDriver();
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public String getText (WebElement element){
        return element.getText();
    }

}
