package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkSheetPage extends BasePage {

    public WorkSheetPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".question-preview")
    private WebElement questionPreview;


    public void setQuestionPreview() {
        this.questionPreview.click();
    }
}
