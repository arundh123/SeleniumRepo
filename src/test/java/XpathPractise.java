import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class XpathPractise {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("signin_button")).click();
        driver.findElement(By.name("user_login")).sendKeys("username");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
        driver.findElement(By.id("user_remember_me")).click();
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        driver.navigate().back();

        driver.get("http://zero.webappsecurity.com/bank/account-activity.html");
        WebElement accdrop = driver.findElement(By.id("aa_accountId"));
        Select account = new Select(accdrop);
        account.selectByValue("4");
       // WebElement value = account.getFirstSelectedOption();
        System.out.println(account.getFirstSelectedOption().getText());
       /* account.selectByVisibleText("Loan");
        account.selectByIndex(1);*/

        Thread.sleep(3000);
    }
}




