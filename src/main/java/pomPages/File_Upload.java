package pomPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class File_Upload {

    WebDriver driver;

    //Constructor
    public File_Upload(WebDriver driver){
        this.driver = driver;
    }

    //Locators
        By upload_File = By.xpath("//input[@class=\"chakra-input css-1c4cd9x\"]");
        By btn_upload = By.xpath("//button[text()=\"Upload File\"]");

    //Action Methods
    public void fileUpload(String path){
        driver.findElement(upload_File).sendKeys(path);
    }

    public void uploadBtn(){
        driver.findElement(btn_upload).click();
    }

}
