import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    @Test

    public void homework1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();     //setting up the object

        driver.get("http://the-internet.herokuapp.com/");     //accessing the website through the object

        driver.findElement(By.linkText("Forgot Password")).click();      //clicking on "Forgot Password" link
        driver.findElement(By.id("email")).sendKeys("SDprofile@protonmail.com");     //Finding the mail box on the site and typing in my mail
        driver.findElement(By.id("form_submit")).click();                //clicks on "Form submit" to send me the information

        driver.quit();      //closes the browser after the test. 

    }

}
