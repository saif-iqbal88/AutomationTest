import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class NewClass {


    public static WebDriver driver;
    @Test
    public void openbrowser() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        Map<String, Object> profile = new HashMap<String, Object>();
        Map<String, Integer> contentSettings = new HashMap<String, Integer>();
        //0 - Default, 1 - Allow, 2 - Block
        contentSettings.put("notifications", 2);
        contentSettings.put("geolocation", 2);
        profile.put("managed_default_content_settings", contentSettings);
        prefs.put("profile", profile);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--remote-allow-origins=*");
//
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--headless");
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        //driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust");
       driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        //driver.get("https://chaldal.com/");

        driver.manage().window().maximize();
 //       driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[2]")).click();
  //      driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/div/div/div[3]")).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys("egg");
        //driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/div[1]/form/div/div[1]/input")).sendKeys(Keys.ENTER);
       // driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[3]/div[2]/div[1]/div/section")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("Saif");
        driver.findElement(By.xpath("(//input[@name=\"name\"])[2]")).sendKeys("Iqbal");
        driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("iqbalsaif90@gmail.com");
        driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("Testabc");
        driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Testabc");
        driver.findElement(By.xpath("(//button[@class=\"btn\"])[1]")).click();





    }
}
