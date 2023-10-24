package Tests.homepage;

import Tests.base.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static constant.Constant.HOME_PAGE_URL;
import static constant.MainPageConstants.TITLE_MAIN_PAGE;
import static org.junit.Assert.assertEquals;
import static pages.MainPage.*;


public class homePageAppearsCheck extends BaseTest {
  @Test
  public void homePageAppearsCheck() {
    basePage.openPage(HOME_PAGE_URL);


    assertEquals(TITLE_MAIN_PAGE, basePage.findElement(title).getText());
    Assert.assertTrue(homePage.findElement(loginButton).isDisplayed());
    Assert.assertTrue(homePage.findElement(demoButton).isDisplayed());
    Assert.assertTrue(homePage.findElement(whyInsiderMenuButton).isDisplayed());
    Assert.assertTrue(homePage.findElement(platformMenuButton).isDisplayed());
    Assert.assertTrue(homePage.findElement(solutionsMenuButton).isDisplayed());
    Assert.assertTrue(homePage.findElement(customersMenuButton).isDisplayed());
    Assert.assertTrue(homePage.findElement(resourcesMenuButton).isDisplayed());
    Assert.assertTrue(homePage.findElement(companyMenuButton).isDisplayed());
    Assert.assertTrue(homePage.findElement(siriusAiMenuButton).isDisplayed());


  }
}
