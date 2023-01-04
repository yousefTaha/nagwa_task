package Pages;
import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends BasePage {

        public homepage(WebDriver driver) {

            super(driver);
        }

        @FindBy(css = ".dropdown")
        private WebElement languageDropdown;

        @FindBy(css = ".arabic")
        private WebElement SelectedLanguage;

        @FindBy(css = ".search")
        private WebElement SearchButton;

        @FindBy(id = "txt_search_query")
        private WebElement SearchText;

        @FindBy(id = "btn_global_search")
        private WebElement clickSearch;


        public void search (String text) {

                this.languageDropdown.click();

                this.SelectedLanguage.click();

                this.SearchButton.click();

                this.SearchText.sendKeys(text);

                this.clickSearch.click();
        }
}
