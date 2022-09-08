import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity2   {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println(title);
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println("text in the url is"+idLocator.getText());
        WebElement classLocator = driver.findElement(By.className("ui inverted huge green button"));
        System.out.println("test in the url is" +classLocator.getText());
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("text is : " +cssLocator.getText());
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.print("Text is : " +linkTextLocator.getText());
        driver.quit();
    }
}
