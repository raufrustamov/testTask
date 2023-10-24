package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class QualityAssurance extends BasePage {

  public QualityAssurance(WebDriver driver) {
    super(driver);
  }

  public static final By seeAllTeams = By.xpath("//*[@id='page-head']//a[contains(text(),'See all QA jobs')]");
  public static final By filterByLocation = By.xpath("//*[@id='select2-filter-by-location-container']");

  public static final By locationIstanbul = By.xpath("//*[@id='select2-filter-by-location-results']//li[contains(text(),'Istanbul, Turkey')]");


  public static final By jobList = By.xpath("//*[@id='jobs-list']");
  public static final By cookiesAccept = By.xpath("//*[@id='wt-cli-accept-all-btn']");

  public static final By position = By.cssSelector(".position-list-item .position-title.font-weight-bold");
  public static final By department = By.cssSelector(".position-list-item .position-department.text-large.font-weight-600.text-primary");
  public static final By jobsLocation = By.cssSelector(".position-list-item .position-location.text-large");

  public static final By viewRole = By.xpath("//*[@id='jobs-list']//a[contains(text(),'View Role')]");
    public QualityAssurance clickOnSeeAll() throws InterruptedException {
    driver.findElement(cookiesAccept).click();
    driver.findElement(seeAllTeams).click();
    Thread.sleep(3000);
    return this;
  }

  public QualityAssurance clickOnViewRole() throws InterruptedException {
    WebElement element = driver.findElement(By.cssSelector(".position-list-item-wrapper.bg-light"));
    element.click();
    Thread.sleep(5000);
    return this;
  }

  public QualityAssurance setFilterByLocation() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(filterByLocation).click();
    driver.findElement(locationIstanbul).click();
    Thread.sleep(3000);
    return this;
  }

  public List<String> attributeExtractor(By by) {
    List<String> textContents = new ArrayList<>();
    List<WebElement> webElements = driver.findElements(by);
    for (WebElement webElement : webElements) {
      String textContent = webElement.getAttribute("textContent");
      textContents.add(textContent);
    }
    return textContents;
  }
}
