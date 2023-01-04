package Test;
import Base.BaseTest;

import Pages.SearchPage;
import Pages.WorkSheetPage;
import Pages.homepage;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class ExecuteTest extends BaseTest {

    @Test

    public void testExecute() {

        homepage HomePage = new homepage(driver);
        HomePage.search("الاضافة");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.setClickInSecondResult();
        WorkSheetPage workSheetPage = new WorkSheetPage(driver);
        workSheetPage.setQuestionPreview();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@data-questionid]"));
        System.out.println(elements.size());
    }




}
