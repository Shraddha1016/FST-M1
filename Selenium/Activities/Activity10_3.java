import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Activity10_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/drag-drop");
        String title = driver.getTitle();
        System.out.println("Title of page is : " +title);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement DZ1 = driver.findElement(By.id("droppable"));
        WebElement DZ2 = driver.findElement(By.id("dropzone2"));
        Actions action = new Actions(driver);
        action.dragAndDrop(ball,DZ1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(DZ1,"background-color"));
        System.out.println("entered in DropZone1");
        action.dragAndDrop(ball,DZ2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(DZ2,"background-colour"));
        Thread.sleep(1000);
        System.out.println("entered in DropZone2");
        driver.quit();
    }

}