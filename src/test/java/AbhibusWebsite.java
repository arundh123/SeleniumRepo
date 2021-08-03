import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AbhibusWebsite {
    public static WebDriver driver;
    public static void listSelect(String xpath, String value){

        List<WebElement> fromOptions = driver.findElements(By.xpath(xpath));

        for (WebElement e : fromOptions) {

            System.out.println(e.getText());
            if (e.getText().equals(value)) {
                e.click();
                break;
            }

        }

    }

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.abhibus.com/");

        driver.findElement(By.id("source")).sendKeys("Chen");
        Thread.sleep(3000);
        listSelect("//ul[@id='ui-id-1']/li","Chennai");
        driver.findElement(By.id("destination")).sendKeys("Del");
        Thread.sleep(3000);
        listSelect("//ul[@id='ui-id-2']/li","Delhi");
        Thread.sleep(3000);
        driver.findElement(By.id("datepicker1")).click();
        Thread.sleep(3000);
        listSelect("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td/a","27");
        Thread.sleep(3000);
        driver.findElement(By.id("datepicker2")).click();
        Thread.sleep(3000);
        listSelect("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td//a","3");
        Thread.sleep(3000);
        driver.close();


        /*List<WebElement> fromOptions = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

        for (WebElement e : fromOptions) {

            System.out.println(e.getText());
            if (e.getText().equals("Chennai")) {
                e.click();
                break;
            }

        }
        Thread.sleep(3000);
        driver.findElement(By.id("destination")).sendKeys("Del");
        Thread.sleep(3000);

        List<WebElement> toOptions = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));

        for (WebElement t : toOptions) {
            System.out.println(t.getText());
            if (t.getText().equals("Delhi")) {
                t.click();
                break;
            }
        }

        driver.findElement(By.id("datepicker1")).click();
        Thread.sleep(3000);

        List<WebElement> dateFrom = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td/a"));

        for (WebElement d : dateFrom) {
            System.out.println(d.getText());
            if (d.getText().equals("27")) {
                d.click();
                break;

            }
        }
        Thread.sleep(3000);
        driver.findElement(By.id("datepicker2")).click();
        Thread.sleep(3000);
        List<WebElement> dateReturn = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//td//a"));
        for (WebElement dr : dateReturn) {
            if (dr.getText().equals("28")) ;
            dr.click();
            break;
        }

        Thread.sleep(3000);*/
    }

}