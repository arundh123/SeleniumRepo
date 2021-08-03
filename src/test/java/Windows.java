import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Windows {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");

        WebElement pw= driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
        pw.click();
        String parent= driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement cw=driver.findElement(By.xpath("//a[text()='Click Here']"));
        cw.click();
        Set<String> allOpenWindows= driver.getWindowHandles();
        System.out.println(allOpenWindows);
        for(String s: allOpenWindows){
            if(!s.equals(parent)){
                driver.switchTo().window(s);
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());


            }
        }



    }
}
