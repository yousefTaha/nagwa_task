package Test;
import Base.BaseTest;
import Factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class ExecuteTest extends BaseTest {

    @Test

    public void testExecute() {
        WebDriver driver = new DriverFactory().InitializeDriver();
        driver.findElement(By.cssSelector(".dropdown")).click();
        driver.findElement(By.cssSelector(".arabic")).click();
        driver.findElement(By.cssSelector(".search")).click();
        driver.findElement(By.id("txt_search_query")).sendKeys("الاضافة");
        driver.findElement(By.id("btn_global_search")).click();
        driver.findElement(By.xpath("//*[@href ='https://www.nagwa.com/ar/lessons/483170139845/']")).click();
        driver.findElement(By.cssSelector(".question-preview")).click();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@data-questionid]"));
        System.out.println(elements.size());
    }




}
