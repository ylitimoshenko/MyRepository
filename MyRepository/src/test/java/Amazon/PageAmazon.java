package Amazon;

import ClasesToAll.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAmazon extends BasePage {

    public PageAmazon(WebDriver driver) {
        super(driver);
    }

    public WebElement getSectionBeautyPicks() {
        return findElementByXpath("//div[@id='desktop-grid-4']");

    }

    public WebElement getLogo() {
        return findElementByXpath("//a[@id='nav-logo-sprites']");
    }

    public WebElement getSearchDropdownBox() {
        return findElementByXpath("//div/span[@id='searchDropdownDescription']");
    }

    public WebElement getSearchIcon() {
        return findElementByXpath("//select[@id='searchDropdownBox']");
    }

    public WebElement getSearchDropDownDesc() {
        return findElementByXpath("//span[@id='searchDropdownDescription']");
    }
}
