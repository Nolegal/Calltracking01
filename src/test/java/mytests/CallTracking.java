package mytests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class CallTracking extends BaseClass{


    public CallTracking(){
        super();

    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();

        driver=null;
    }

    @Test(dataProvider = "testdata")
    public static void callTracking01(String name, String email, String phone,String text) throws InterruptedException, MalformedURLException {
        //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        //System.setProperty("webdriver.chrome.driver", "/Users/setininoleksandrvaceslavovic/IdeaProjects/untitled5/drivers/chromedriver 4");
       // WebDriverManager.chromedriver().setup();
        //DesiredCapabilities capabilities = new DesiredCapabilities();
        //  capabilities.setBrowserName("chrome");
        // capabilities.setVersion("112.0");
        //   WebDriver driver = new RemoteWebDriver(new URL("http://10.0.1.114:9090/"),capabilities);

       //WebDriver driver = new ChromeDriver();
        //DesiredCapabilities desc = DesiredCapabilities.chrome();
        //WebDriver driver= new RemoteWebDriver(new URL("http://10.0.1.114:1234/wd/hub"),desc);

        // ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setCapability("browserVersion", "112");
        // chromeOptions.setCapability("platformName", "Linux");
        //WebDriver driver = new RemoteWebDriver(new URL("http://10.0.1.114:1234/wd/hub"), chromeOptions);




        //driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);









            navigateToURL("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=anything");
            JavascriptExecutor jse=(JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,400)");

            driver.findElement(By.xpath("//body/div[1]/form[1]/input[1]")).click();
            driver.findElement(By.xpath("//body/div[1]/form[1]/input[1]")).sendKeys(name);

            driver.findElement(By.xpath("//body/div[1]/form[1]/input[2]")).click();
            driver.findElement(By.xpath("//body/div[1]/form[1]/input[2]")).sendKeys(email);

            driver.findElement(By.xpath("//body/div[1]/form[1]/input[3]")).click();
            driver.findElement(By.xpath("//body/div[1]/form[1]/input[3]")).sendKeys(phone);

            driver.findElement(By.xpath("//body/div[1]/form[1]/textarea[1]")).click();
            driver.findElement(By.xpath("//body/div[1]/form[1]/textarea[1]")).sendKeys(text);




            driver.findElement (By.xpath ("//body/div[1]/form[1]/input[4]")).click();







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

driver.quit();
     */
        /*
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
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs28 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs28.get(28));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs29 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs29.get(29));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs30 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs30.get(30));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs31 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs31.get(31));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs32 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs32.get(32));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs33 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs33.get(33));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs34 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs34.get(34));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs35 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs35.get(35));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs36 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs36.get(36));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs37 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs37.get(37));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs38 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs38.get(38));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs39 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs39.get(39));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs40 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs40.get(40));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs41 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs41.get(41));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs42 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs42.get(42));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs43 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs43.get(43));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs44 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs44.get(44));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs45 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs45.get(45));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs46 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs46.get(46));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs47 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs47.get(47));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs48 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs48.get(48));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs49 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs49.get(49));
        driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs50 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs50.get(50));

     */


        //driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        //driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=anything");
        // driver.wait(7000);
        //driver.close();
        // driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=organic");
        //  driver.wait(7000);
        // driver.quit();
        // driver.get("https://calltracking.ru/testqa/index.php?utm_source=google&utm_medium=cpc");
        // driver.wait(7000);
        //driver.close();


    }


    @DataProvider(name="testdata")
    public Object[][] TestDataFeed(){

// Create object array with 2 rows and 2 column- first parameter is row and second is //column
        Object [][] calltrackingdata=new Object[20][4];

// Enter data to row 0 column 0
        calltrackingdata[0][0]="Тест";
// Enter data to row 0 column 1
        calltrackingdata[0][1]="test@i.ru";
// Enter data to row 1 column 0
        calltrackingdata[0][2]="+389623920000";

        calltrackingdata[0][3]="Нет";


        calltrackingdata[1][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[1][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[1][2]="+389623923921";

        calltrackingdata[1][3]="Да";


        calltrackingdata[2][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[2][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[2][2]="+389623920002";

        calltrackingdata[2][3]="Да";


        calltrackingdata[3][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[3][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[3][2]="+389623920003";

        calltrackingdata[3][3]="Да";


        calltrackingdata[4][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[4][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[4][2]="+389623920004";

        calltrackingdata[4][3]="Да";


        calltrackingdata[5][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[5][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[5][2]="+389623920005";

        calltrackingdata[5][3]="Да";


        calltrackingdata[6][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[6][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[6][2]="+389623920006";

        calltrackingdata[6][3]="Да";

        calltrackingdata[7][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[7][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[7][2]="+389623920007";

        calltrackingdata[7][3]="Да";


        calltrackingdata[8][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[8][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[8][2]="+389623920008";

        calltrackingdata[8][3]="Да";


        calltrackingdata[9][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[9][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[9][2]="+389623920009";

        calltrackingdata[9][3]="Да";

        calltrackingdata[10][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[10][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[10][2]="+389623920010";

        calltrackingdata[10][3]="Да";


        calltrackingdata[11][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[11][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[11][2]="+389623920011";

        calltrackingdata[11][3]="Да";


        calltrackingdata[12][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[12][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[12][2]="+389623920012";

        calltrackingdata[12][3]="Да";


        calltrackingdata[13][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[13][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[13][2]="+389623920013";

        calltrackingdata[13][3]="Да";


        calltrackingdata[14][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[14][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[14][2]="+389623920014";

        calltrackingdata[14][3]="Да";


        calltrackingdata[15][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[15][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[15][2]="+389623920015";

        calltrackingdata[15][3]="Да";

        calltrackingdata[16][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[16][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[16][2]="+389623920016";

        calltrackingdata[16][3]="Да";


        calltrackingdata[17][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[17][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[17][2]="+389623920017";

        calltrackingdata[17][3]="Да";


        calltrackingdata[18][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[18][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[18][2]="+389623920018";

        calltrackingdata[18][3]="Да";


        calltrackingdata[19][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[19][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[19][2]="+389623920019";

        calltrackingdata[19][3]="Да";






        return calltrackingdata;
    }




}
