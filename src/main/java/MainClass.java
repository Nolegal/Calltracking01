import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
         //  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
       // System.setProperty("webdriver.chrome.driver", "/Users/setininoleksandrvaceslavovic/IdeaProjects/untitled5/drivers/chromedriver 4");
        WebDriverManager.chromedriver().setup();
          // WebDriver driver = new ChromeDriver();

        WebDriver driver;

        ChromeOptions options = new ChromeOptions();
       options.addArguments("headless");
        driver=new ChromeDriver(options);

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




       // driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=anything");
       // driver.wait(7000);
        //driver.close();
       // driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=organic");
      //  driver.wait(7000);
        //driver.close();
       // driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
       // driver.wait(7000);
        //driver.close();



    }


}
