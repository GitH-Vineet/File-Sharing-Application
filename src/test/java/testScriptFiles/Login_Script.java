package testScriptFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pomPages.Login;

import java.time.Duration;

public class Login_Script{

      WebDriver driver;

      @BeforeClass
      void setUp(){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://file-sharing-application.netlify.app/login");
      }

      @Test(priority = 1)
      void testLogin(){
            Login lgnScript = new Login(driver);
            lgnScript.setEmail("test.masai@gmail.com");
            lgnScript.setPassword("masai321");
            lgnScript.loginBtn();

            Assert.assertEquals(driver.getTitle(),"File Sharing App");

      }

      @AfterClass
      void tearDown(){
            driver.quit();
            System.out.println("Test is Passed Successfully");
      }
}
