package parabank.parasoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RegisterPage {
    WebDriver driver;
    By tittleRegisterFormXpath = By.xpath("//*[@id=\"rightPanel\"]/h1");
    By firstNameFieldId = By.id("customer.firstName");
    By lastNameFieldId = By.id("customer.lastName");
    By addressfieldId = By.id("customer.address.street");
    By cityFieldId = By.id("customer.address.city");
    By stateFieldId = By.id("customer.address.state");
    By zipCodeFieldId = By.id("customer.address.zipCode");
    By phoneFieldId = By.id("customer.phoneNumber");
    By ssnFieldId = By.id("customer.ssn");
    By usernameFieldId = By.id("customer.username");
    By passwordFieldId = By.id("customer.password");
    By passwordConfirmFieldId = By.id("repeatedPassword");
    By registerBtmXpath = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");

    private By[] register = {firstNameFieldId,
            lastNameFieldId,
            addressfieldId,
            cityFieldId,
            stateFieldId,
            zipCodeFieldId,
            phoneFieldId,
            ssnFieldId,
            usernameFieldId,
            passwordFieldId};

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void isDisplayedTittleFormRegister(){
        driver.findElement(tittleRegisterFormXpath).isDisplayed();
    }

    public void registerUser(String[] register){
        for (int i=0;i<this.register.length;i++){
            driver.findElement((this.register[i])).clear();
            driver.findElement(this.register[i]).sendKeys(register[i]);
        }
        driver.findElement(passwordConfirmFieldId).sendKeys(register[register.length-1]);
        driver.findElement(registerBtmXpath).click();
    }
}
