import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ActionsLearn {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

       // WebElement pw= driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
        //pw.click();
        WebElement a= driver.findElement(By.id("credit1"));
        WebElement b= driver.findElement(By.id("loan"));
        Thread.sleep(3000);
        Actions action=new Actions(driver);
        action.dragAndDrop(a,b);
        action.sendKeys("a");
        WebElement dc= driver.findElement(By.id("t7"));

        action.doubleClick(dc);
        action.build().perform();
    }
}
