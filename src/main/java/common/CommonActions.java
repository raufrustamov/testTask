package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import static constant.Constant.*;

public class CommonActions {
  public static WebDriver createDriver(Browsers browser) {

    WebDriver driver = switch (browser) {
      case CHROME -> {
            System.setProperty("webdriver.chrome.driver", PATH_TO_CHROME);
            yield new ChromeDriver();
        }
      case EDGE -> {
            System.setProperty("webdriver.edge.driver", PATH_TO_EDGE);
            yield new EdgeDriver();
        }
      case FIREFOX -> {
            System.setProperty("webdriver.gecko.driver", PATH_TO_FIREFOX);
            yield new FirefoxDriver();
        }
    };
      driver.manage().window().maximize();
    return driver;
  }
}
