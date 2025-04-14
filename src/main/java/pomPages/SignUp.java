package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
    WebDriver driver;

    //Constructor
    public SignUp(WebDriver driver){
        this.driver = driver;
    }

    //Locators
        By txt_userName = By.cssSelector("input[id='field-:r0:']");
        By txt_email = By.cssSelector("input[id='field-:r1:']");
        By txt_password =  By.cssSelector("input[id='field-:r2:']");
        By btn_signUp = By.cssSelector(".chakra-button.css-rxecov");
        By errorPopUp = By.cssSelector("id=\"toast-1-title\"");

    //Action Methods
    public void setUsername(String user){
        driver.findElement(txt_userName).sendKeys(user);
    }

    public void setEmail(String email){
        driver.findElement(txt_email).sendKeys(email);
    }

    public void setPassword(String pass){
        driver.findElement(txt_password).sendKeys(pass);
    }

    public void btnSignup(){
        driver.findElement(btn_signUp).click();
    }

    public boolean popUp(){
       return driver.findElement(errorPopUp).isDisplayed();
    }
}
