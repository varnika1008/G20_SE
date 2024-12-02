// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class HomepageTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void homepage() {
    driver.get("http://localhost:3000/");
    driver.manage().window().setSize(new Dimension(1552, 832));
    driver.findElement(By.cssSelector(".css-1z0fq0c-MuiButtonBase-root-MuiIconButton-root > .MuiSvgIcon-root")).click();
    driver.findElement(By.cssSelector(".css-1gu98ks-MuiButtonBase-root-MuiIconButton-root path")).click();
    driver.findElement(By.cssSelector(".MuiButton-text:nth-child(5)")).click();
    driver.findElement(By.id(":rh:")).click();
    driver.findElement(By.id(":rh:")).sendKeys("padiakeyur@gmail.com");
    driver.findElement(By.id(":rj:")).click();
    driver.findElement(By.id(":rj:")).sendKeys("Keyur@123");
    driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".MuiListItem-root:nth-child(1) .MuiTypography-root")).click();
    driver.findElement(By.cssSelector(".MuiListItem-root:nth-child(2) .MuiTypography-root")).click();
    driver.findElement(By.cssSelector(".MuiListItem-root:nth-child(3) .MuiTypography-root")).click();
    driver.findElement(By.cssSelector(".MuiListItem-root:nth-child(1) > .MuiButtonBase-root")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiIconButton-edgeStart path"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".MuiIconButton-edgeStart path")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".MuiButtonBase-root:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".MuiGrid-root:nth-child(1) > .MuiPaper-root .MuiCardMedia-root")).click();
    js.executeScript("window.scrollTo(0,0)");
  }
}
