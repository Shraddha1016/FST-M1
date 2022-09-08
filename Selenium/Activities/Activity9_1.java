import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement ch = driver.findElement(By.id("single-value"));
        Select dd = new Select(driver.findElement(By.id("single-select")));
        dd.selectByVisibleText("Option 2");
        System.out.println(ch.getText());
        dd.selectByIndex(3);
        System.out.println(ch.getText());
        dd.selectByValue("4");
        System.out.println(ch.getText());
        List<WebElement> options = dd.getOptions();
        for(WebElement option : options) {
            System.out.println("Option: " + option.getText());
        }
        driver.quit();
    }
}