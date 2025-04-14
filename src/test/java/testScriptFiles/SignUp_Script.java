package testScriptFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomPages.SignUp;

import java.time.Duration;

public class SignUp_Script {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://file-sharing-application.netlify.app/signup");
    }

    @Test(priority = 1)
    public void signUp(){
        SignUp sgnUp = new SignUp(driver);
        sgnUp.setUsername("Nanvin");
        sgnUp.setEmail("nanvin@gmail.com");
        sgnUp.setPassword("180320");
        sgnUp.btnSignup();
    }

    @Test(priority = 2)
    public void invalidSignUp() throws InterruptedException {
        SignUp invSgnUp = new SignUp(driver);
        invSgnUp.setUsername(";) I'm an Error");
        invSgnUp.setEmail("1234@email.7");
        invSgnUp.setPassword("87654321");
        invSgnUp.btnSignup();
        Thread.sleep(3000);
        Assert.assertTrue(invSgnUp.popUp());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        System.out.println("Test is Passed Successfully");
    }

}
