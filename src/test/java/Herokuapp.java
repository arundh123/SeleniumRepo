import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Herokuapp {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[text()='Frames']")).click();
        driver.findElement(By.xpath("//a[text()='iFrame']")).click();
        driver.switchTo().frame("mce_0_ifr");
       // System.out.println(driver.);
        WebElement sent= driver.findElement(By.id("tinymce"));
        sent.sendKeys("Switched to frame");
        System.out.println(sent.getText());

        driver.navigate().back();

        driver.findElement(By.xpath("//a[text()= 'Nested Frames']")).click();

        Set<String> allwindows=driver.getWindowHandles();
        System.out.println(allwindows);


    }
}
