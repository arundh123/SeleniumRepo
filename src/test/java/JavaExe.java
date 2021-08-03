import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class JavaExe {


    public static void main(String[] args) throws IOException {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.snapdeal.com/");

        WebElement printer = driver.findElement(By.xpath("//span[text()='Printers']"));
        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Your email address']"));
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].click();", printer);
        je.executeScript("arguments[0].scrollIntoView(true);", email);
        je.executeScript("arguments[0].click();",email);

       /* TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
        File screenshot = takeScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Arundhathi\\Automation\\LearnSelenium-20210803T025224Z-001\\LearnSelenium\\src\\test\\Screenshot"));
        driver.close();*/

    }
}
