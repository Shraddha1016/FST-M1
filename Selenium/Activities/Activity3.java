import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity3 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.training-support.net/selenium/simple-form");
        //driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.print("Title of the page is :" +title);
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("Leena");
        lastName.sendKeys("Sharma");
        driver.findElement(By.id("email")).sendKeys("test1@example.com");
        driver.findElement(By.id("number")).sendKeys("1234567890");
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        driver.quit();
    }
}