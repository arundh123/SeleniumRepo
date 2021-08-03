import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
    public static void main(String[] args) {


    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");

        driver.findElement(By.xpath("//a[text()='Frames']")).click();


         driver.findElement(By.xpath("//a[text()= 'Nested Frames']")).click();
        WebElement left= driver.findElement(By.xpath("//frame[@name='frame-left']"));
         driver.switchTo().frame(left);
        System.out.println(left.getText());
}
}