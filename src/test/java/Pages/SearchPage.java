package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@href ='https://www.nagwa.com/ar/lessons/483170139845/']")
    private WebElement clickInSecondResult;


    public void setClickInSecondResult(){

        this.clickInSecondResult.click();
    }


}
