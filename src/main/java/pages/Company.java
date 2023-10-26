package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Company extends BasePage {

  public Company(WebDriver driver) {
    super(driver);
  }

  public static final By customerSuccess = By.xpath("//*[@id='career-find-our-calling']//a/h3[contains(text(),'Customer Success')]");
  public static final By sales = By.xpath("//*[@id='career-find-our-calling']//a/h3[contains(text(),'Sales')]");
  public static final By productAndEngineering = By.xpath("//*[@id='career-find-our-calling']//a/h3[contains(text(),'Product & Engineering')]");
  public static final By financeAndBusinessSupport = By.xpath("//*[@id='career-find-our-calling']//a/h3[contains(text(),'Finance & Business Support')]");
  public static final By marketing = By.xpath("//*[@id='career-find-our-calling']//a/h3[contains(text(),'Marketing')]");
  public static final By ceoExecutiveOffice = By.xpath("//*[@id='career-find-our-calling']//a/h3[contains(text(),'CEO’s Executive Office')]");
  public static final By location = By.xpath("//*[@id='location-slider']//p[contains(text(),'New York')]");
  public static final By lifeAtInsider = By.xpath("//div[@class='elementor-widget-wrap elementor-element-populated e-swiper-container']//h2");

}
