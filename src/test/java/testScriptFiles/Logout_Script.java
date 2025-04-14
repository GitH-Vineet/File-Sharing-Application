package testScriptFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomPages.Login;
import pomPages.Logout;

import java.time.Duration;

public class Logout_Script {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://file-sharing-application.netlify.app/login");
    }

    @Test
    public void Logout() throws InterruptedException {
            Logout logScript = new Logout(driver);
            Login lgnScript = new Login(driver);

            lgnScript.setEmail("test.masai@gmail.com");
            lgnScript.setPassword("masai321");
            lgnScript.loginBtn();

            Assert.assertEquals(driver.getTitle(), "File Sharing App");
            driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
            Thread.sleep(2000);

           logScript.click_UserProfile();
           Thread.sleep(3000);
            logScript.click_Logout();
        }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
