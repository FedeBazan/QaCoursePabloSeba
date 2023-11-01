package parabank.parasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RegisterPage {
    WebDriver driver;
    By tittleRegisterFormClass = By.className("tittle");
    By firstNameFieldId = By.id("customer.firstname");
    By lastNameFieldId = By.id("customer.lastName");
    By addressfieldId = By.id("customer.address.street");
    By cityFieldId = By.id("customer.address.city");
    By stateFieldId = By.id("customer.address.state");
    By zipCodeFieldId = By.id("customer.address.zipCode");
    By phoneFieldId = By.id("customer.phoneNumber");
    By ssnFieldId = By.id("customer.ssn");
    By usernameFieldId = By.id("customer.username");
    By passwordFieldId = By.id("customer.password");
    By registerBtmXpath = By.xpath("customer.password");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void isDisplayedTittleFormRegister(){
        driver.findElement(tittleRegisterFormClass).isDisplayed();
    }

    public void registerUser(String firstName,String lastName,String address,St){

    }
}
