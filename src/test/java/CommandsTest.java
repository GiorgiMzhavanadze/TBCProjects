import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CommandsTest {

    @Test

    public void Test1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://uitestpractice.com/Students");

        driver.findElement(By.linkText("Actions")).click();

        Actions action = new Actions(driver);

        action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
        action.clickAndHold(driver.findElement(By.name("one"))).moveToElement(driver.findElement(By.name("twelve"))).release().build().perform();






    }



}
