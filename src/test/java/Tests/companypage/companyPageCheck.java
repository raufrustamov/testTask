package Tests.companypage;

import Tests.base.BaseTest;
import org.junit.Test;

import static constant.CompanyPageConstants.*;
import static constant.Constant.HOME_PAGE_URL;
import static org.junit.Assert.assertEquals;
import static pages.Company.*;

public class companyPageCheck extends BaseTest {


  @Test
  public void career() {

    basePage.openPage(HOME_PAGE_URL);

    homePage.navigateToCareersPage();
    assertEquals(CUSTOMER_SUCCESS_TEAM, company.findElement(customerSuccess).getText());
    assertEquals(LOCATION_US, company.findElement(location).getText());
    assertEquals(TITLE_ON_COMPANY_PAGE, company.findElement(lifeAtInsider).getText());
    //More assertions can be added

  }
}
