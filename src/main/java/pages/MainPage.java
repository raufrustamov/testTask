package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class MainPage extends BasePage {
  public MainPage(WebDriver driver) {
    super(driver);
  }

  public static final By title = By.id("announce");
  public static final By loginButton = By.xpath("//div[@id='navbarNavDropdown']//a[text()='Login']");
  public static final By demoButton = By.xpath("//div[@id='navbarNavDropdown']//a[contains(text(),'Get a Demo')]");
  public static final By whyInsiderMenuButton = By.xpath("//div[@id='navbarNavDropdown']//a[contains(text(),'Why Insider')]");
  public static final By platformMenuButton = By.xpath("//div[@id='navbarNavDropdown']//a[contains(text(),'Platform')]");
  public static final By solutionsMenuButton = By.xpath("//div[@id='navbarNavDropdown']//a[contains(text(),'Solutions')]");
  public static final By customersMenuButton = By.xpath("//div[@id='navbarNavDropdown']//a[contains(text(),'Customers')]");
  public static final By resourcesMenuButton = By.xpath("//div[@id='navbarNavDropdown']//a[contains(text(),'Resources')]");
  public static final By companyMenuButton = By.xpath("//div[@id='navbarNavDropdown']//a[contains(text(),'Company')]");
  public static final By siriusAiMenuButton = By.xpath("//div[@id='navbarNavDropdown']//a[contains(text(),'Sirius AI')]");
  public static final By companyCareers = By.xpath("//div[@id='navbarNavDropdown']//a[contains(text(),'Careers')]");

  public void navigateToCareersPage(){
    driver.findElement(companyMenuButton).click();
    driver.findElement(companyCareers).click();
  }
}
