package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static constant.Constant.EXPL_WAIT;


public class BasePage {
  protected static WebDriver driver;

  public BasePage(WebDriver driver) {
    this.driver = driver;
  }

  public void openPage(String url){
    driver.get(url);
  }

  public  void closePage(){
    driver.close();
  }

  public WebElement waitForElementVisible(WebElement element){
    new WebDriverWait(driver,Duration.ofSeconds(EXPL_WAIT) ).until(ExpectedConditions.visibilityOf(element));
    return element;
  }

  public WebElement findElement (By by){
      return driver.findElement(by);
  }







}
