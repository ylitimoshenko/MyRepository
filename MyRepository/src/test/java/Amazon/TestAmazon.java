package Amazon;

import ClasesToAll.TestInit;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon extends TestInit {

    @Test
    public void checkSectionAmazon(){
        PageAmazon pageAmazon = new PageAmazon(driver);
        openUrl("https://www.amazon.com/");
        pageAmazon.getSectionBeautyPicks().click();

        Assert.assertTrue(pageAmazon.getLogo().isDisplayed());
    }

    @Test
    public void checkDropDownBox(){
        PageAmazon pageAmazon = new PageAmazon(driver);
        openUrl("https://www.amazon.com/");
        sleep(2);
        pageAmazon.getSearchDropdownBox().click();
//        pageAmazon.getSearchDropdownBox().click();
    }
}
