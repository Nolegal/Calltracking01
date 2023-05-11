package mytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class CallTracking {
    @Test
    public static void callTracking01() throws InterruptedException, MalformedURLException {
           System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
       // System.setProperty("webdriver.chrome.driver", "/Users/setininoleksandrvaceslavovic/IdeaProjects/untitled5/drivers/chromedriver 4");
        WebDriverManager.chromedriver().setup();
        //DesiredCapabilities capabilities = new DesiredCapabilities();
      //  capabilities.setBrowserName("chrome");
       // capabilities.setVersion("112.0");
       //   WebDriver driver = new RemoteWebDriver(new URL("http://10.0.1.114:9090/"),capabilities);

        //WebDriver driver= new ChromeDriver();
        //DesiredCapabilities desc = DesiredCapabilities.chrome();
        //WebDriver driver= new RemoteWebDriver(new URL("http://10.0.1.114:1234/wd/hub"),desc);

       // ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setCapability("browserVersion", "112");
       // chromeOptions.setCapability("platformName", "Linux");
        //WebDriver driver = new RemoteWebDriver(new URL("http://10.0.1.114:1234/wd/hub"), chromeOptions);






        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
       options.addArguments("headless");
        driver= new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

      //  driver.get("https://www.calltracking.ru");

    /*    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[1]/nav[1]/div[2]/div[1]/button[1]")).click();



        driver.findElement(By.className("demo_access_form")).findElement(By.id("first_step_name")).click();
        driver.findElement(By.className("demo_access_form")).findElement(By.id("first_step_name")).sendKeys("Тест");

        driver.findElement(By.className("demo_access_form")).findElement(By.className("email_validation")).click();
        driver.findElement(By.className("demo_access_form")).findElement(By.className("email_validation")).sendKeys("test@i.ua");

        driver.findElement(By.className("demo_access_form")).findElement(By.className("phone_validation")).click();
        driver.findElement(By.className("demo_access_form")).findElement(By.className("phone_validation")).sendKeys("9623923920");

        driver.findElement(By.className("demo_access_form")).findElement(By.className("btn-white")).click();

        driver.findElement(By.xpath("//input[@name='quest_code']")).sendKeys("12345");

//TRY MANUAL - NOT WORKING BUTTON
        driver.findElement(By.id("submit-modal-demo")).click();
// System.out.println(driver.getTitle());

driver.quit();*/
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=anything");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=organic");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(2));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(3));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(4));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs5 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs5.get(5));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs6 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs6.get(6));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs7 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs7.get(7));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs8 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs8.get(8));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs9 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs9.get(9));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs10 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs10.get(10));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs11 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs11.get(11));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs12 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs12.get(12));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs13 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs13.get(13));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs14 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs14.get(14));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");

        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs15 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs15.get(15));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs16 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs16.get(16));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs17 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs17.get(17));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs18 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs18.get(18));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs19 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs19.get(19));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs20 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs20.get(20));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs21 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs21.get(21));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs22 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs22.get(22));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs23 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs23.get(23));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs24 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs24.get(24));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs25 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs25.get(25));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs26 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs26.get(26));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs27 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs27.get(27));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");



        //driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=anything");
       // driver.wait(7000);
       // driver.close();
       // driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=organic");
      //  driver.wait(7000);
        //driver.close();
       // driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
       // driver.wait(7000);
        //driver.close();



    }


}
