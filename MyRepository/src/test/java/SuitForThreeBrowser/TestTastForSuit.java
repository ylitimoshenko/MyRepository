package SuitForThreeBrowser;
import ClasesToAll.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTastForSuit extends TestInit {

    @Test
    public void checkLiveChat() {
        PageTaskForSuit pageTaskForSuit = new PageTaskForSuit(driver);
        openUrl("https://qa2.eatstreet.com/");
        pageTaskForSuit.checkAndClousePopUpWindow();
        pageTaskForSuit.clickBtnLiveChat().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://qa2.eatstreet.com/"));
    }

    @Test
    public void apiTabCheck() {
        PageTaskForSuit pageTaskForSuit = new PageTaskForSuit(driver);
        openUrl("https://qa2.eatstreet.com/");
        pageTaskForSuit.checkAndClousePopUpWindow();
        pageTaskForSuit.btnAPI().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://developers.eatstreet.com/"));
    }
}