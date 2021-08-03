import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FramesLearn {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        //driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
       // System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Arundhathi");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);






    }
}
