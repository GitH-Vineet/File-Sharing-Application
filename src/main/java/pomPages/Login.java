package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    //Constructor
    public Login(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    By txt_email = By.xpath("//input[@placeholder=\"example@gmail.com\"]");
    By txt_password = By.xpath("//input[@placeholder=\"Enter Your Password\"]");
    By btn_login = By.xpath("//button[text()=\"Login\"]");


    //Action Methods
    public void setEmail(String user){
        driver.findElement(txt_email).sendKeys(user);
    }

    public void setPassword(String pass){
        driver.findElement(txt_password).sendKeys(pass);
    }

    public void loginBtn(){
        driver.findElement(btn_login).click();
    }
}
