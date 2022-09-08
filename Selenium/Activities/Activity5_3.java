import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title = " + driver.getTitle());
        WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("The textfield is selected: " + text.isEnabled());
        driver.findElement(By.id("toggleInput")).click();
        System.out.println("The textfield is selected: " + text.isEnabled());
        driver.quit();
    }
}