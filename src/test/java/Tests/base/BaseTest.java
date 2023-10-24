package Tests.base;

import common.Browsers;
import common.CommonActions;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import pages.Company;
import pages.MainPage;
import pages.QualityAssurance;
import pages.base.BasePage;


public class BaseTest {

  protected WebDriver driver = CommonActions.createDriver(Browsers.FIREFOX);
  protected BasePage basePage = new BasePage(driver);
  protected MainPage homePage = new MainPage(driver);
  protected Company company = new Company(driver);

  protected QualityAssurance qa = new QualityAssurance(driver);


}
