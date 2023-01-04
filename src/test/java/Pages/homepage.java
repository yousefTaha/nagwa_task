package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {

    public class homepage extends BasePage {

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(css = "[data-testid=\"email\"]")
        private WebElement emailInput;

        @FindBy(css = "[data-testid=\"password\"]")
        private WebElement passwordInput;

        @FindBy(css = "[data-testid=\"submit\"]")
        private WebElement submit;
}
