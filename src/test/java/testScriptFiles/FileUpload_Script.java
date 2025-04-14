package testScriptFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pomPages.File_Upload;
import pomPages.Login;

import java.time.Duration;

public class FileUpload_Script {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://file-sharing-application.netlify.app/login");
    }

    @Test(priority = 1)
    public void file_Upload() throws InterruptedException {
        Login lgnScript = new Login(driver);
        lgnScript.setEmail("test.masai@gmail.com");
        lgnScript.setPassword("masai321");
        lgnScript.loginBtn();

        File_Upload flUp = new File_Upload(driver);
        flUp.fileUpload("C:\\Users\\vinee\\OneDrive\\Pictures\\Image20240118134927.png");
        flUp.uploadBtn();

    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }

}
