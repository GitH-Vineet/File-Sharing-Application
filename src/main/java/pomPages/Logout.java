package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
    WebDriver driver;

    //Constructor
    public Logout(WebDriver driver){
        this.driver = driver;
    }

    //Locators
    By btn_userProfile = By.xpath("//button[@aria-haspopup='menu']");
    By btn_logout = By.xpath("(//button[@type=\"button\"])[3]");


    //Action Methods
    public void click_UserProfile(){
        driver.findElement(btn_userProfile).click();
    }

    public void click_Logout(){
        driver.findElement(btn_logout).click();
    }
}
