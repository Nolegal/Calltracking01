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
        Object [][] calltrackingdata=new Object[100][4];

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


        calltrackingdata[20][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[20][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[20][2]="+389623920020";

        calltrackingdata[20][3]="Да";


        calltrackingdata[21][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[21][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[21][2]="+389623920021";

        calltrackingdata[21][3]="Да";


        calltrackingdata[22][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[22][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[22][2]="+389623920022";

        calltrackingdata[22][3]="Да";


        calltrackingdata[23][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[23][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[23][2]="+389623920023";

        calltrackingdata[23][3]="Да";


        calltrackingdata[24][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[24][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[24][2]="+389623920024";

        calltrackingdata[24][3]="Да";


        calltrackingdata[25][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[25][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[25][2]="+389623920025";

        calltrackingdata[25][3]="Да";


        calltrackingdata[26][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[26][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[26][2]="+389623920026";

        calltrackingdata[26][3]="Да";


        calltrackingdata[27][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[27][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[27][2]="+389623920027";

        calltrackingdata[27][3]="Да";


        calltrackingdata[28][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[28][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[28][2]="+389623920028";

        calltrackingdata[28][3]="Да";


        calltrackingdata[29][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[29][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[29][2]="+389623920029";

        calltrackingdata[29][3]="Да";


        calltrackingdata[30][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[30][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[30][2]="+389623920030";

        calltrackingdata[30][3]="Да";


        calltrackingdata[31][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[31][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[31][2]="+389623920031";

        calltrackingdata[31][3]="Да";


        calltrackingdata[32][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[32][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[32][2]="+389623920032";

        calltrackingdata[32][3]="Да";


        calltrackingdata[33][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[33][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[33][2]="+389623920033";

        calltrackingdata[33][3]="Да";


        calltrackingdata[34][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[34][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[34][2]="+389623920034";

        calltrackingdata[34][3]="Да";


        calltrackingdata[35][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[35][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[35][2]="+389623920035";

        calltrackingdata[35][3]="Да";


        calltrackingdata[36][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[36][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[36][2]="+389623920036";

        calltrackingdata[36][3]="Да";


        calltrackingdata[37][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[37][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[37][2]="+389623920037";

        calltrackingdata[37][3]="Да";


        calltrackingdata[38][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[38][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[38][2]="+389623920038";

        calltrackingdata[38][3]="Да";


        calltrackingdata[39][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[39][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[39][2]="+389623920039";

        calltrackingdata[39][3]="Да";


        calltrackingdata[40][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[40][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[40][2]="+389623920040";

        calltrackingdata[40][3]="Да";


        calltrackingdata[41][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[41][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[41][2]="+389623920041";

        calltrackingdata[41][3]="Да";


        calltrackingdata[42][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[42][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[42][2]="+389623920042";

        calltrackingdata[42][3]="Да";


        calltrackingdata[43][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[43][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[43][2]="+389623920043";

        calltrackingdata[43][3]="Да";


        calltrackingdata[44][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[44][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[44][2]="+389623920044";

        calltrackingdata[44][3]="Да";


        calltrackingdata[45][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[45][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[45][2]="+389623920045";

        calltrackingdata[45][3]="Да";


        calltrackingdata[46][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[46][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[46][2]="+389623920046";

        calltrackingdata[46][3]="Да";


        calltrackingdata[47][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[47][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[47][2]="+389623920047";

        calltrackingdata[47][3]="Да";


        calltrackingdata[48][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[48][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[48][2]="+389623920048";

        calltrackingdata[48][3]="Да";

        calltrackingdata[49][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[49][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[49][2]="+389623920049";

        calltrackingdata[49][3]="Да";


        calltrackingdata[50][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[50][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[50][2]="+389623920050";

        calltrackingdata[50][3]="Да";


        calltrackingdata[51][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[51][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[51][2]="+389623920051";

        calltrackingdata[51][3]="Да";


        calltrackingdata[52][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[52][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[52][2]="+389623920052";

        calltrackingdata[52][3]="Да";


        calltrackingdata[53][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[53][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[53][2]="+389623920053";

        calltrackingdata[53][3]="Да";


        calltrackingdata[54][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[54][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[54][2]="+389623920054";

        calltrackingdata[54][3]="Да";


        calltrackingdata[55][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[55][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[55][2]="+389623920055";

        calltrackingdata[55][3]="Да";


        calltrackingdata[56][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[56][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[56][2]="+389623920056";

        calltrackingdata[56][3]="Да";


        calltrackingdata[57][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[57][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[57][2]="+389623920057";

        calltrackingdata[57][3]="Да";


        calltrackingdata[58][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[58][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[58][2]="+389623920058";

        calltrackingdata[58][3]="Да";


        calltrackingdata[59][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[59][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[59][2]="+389623920059";

        calltrackingdata[59][3]="Да";


        calltrackingdata[60][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[60][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[60][2]="+389623920060";

        calltrackingdata[60][3]="Да";


        calltrackingdata[61][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[61][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[61][2]="+389623920061";

        calltrackingdata[61][3]="Да";


        calltrackingdata[62][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[62][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[62][2]="+389623920062";

        calltrackingdata[62][3]="Да";


        calltrackingdata[63][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[63][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[63][2]="+389623920063";

        calltrackingdata[63][3]="Да";


        calltrackingdata[64][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[64][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[64][2]="+389623920064";

        calltrackingdata[64][3]="Да";


        calltrackingdata[65][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[65][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[65][2]="+389623920065";

        calltrackingdata[65][3]="Да";


        calltrackingdata[66][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[66][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[66][2]="+389623920066";

        calltrackingdata[66][3]="Да";


        calltrackingdata[67][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[67][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[67][2]="+389623920067";

        calltrackingdata[67][3]="Да";


        calltrackingdata[68][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[68][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[68][2]="+389623920068";

        calltrackingdata[68][3]="Да";


        calltrackingdata[69][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[69][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[69][2]="+389623920069";

        calltrackingdata[69][3]="Да";


        calltrackingdata[70][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[70][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[70][2]="+389623920070";

        calltrackingdata[70][3]="Да";


        calltrackingdata[71][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[71][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[71][2]="+389623920071";

        calltrackingdata[71][3]="Да";


        calltrackingdata[72][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[72][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[72][2]="+389623920072";

        calltrackingdata[72][3]="Да";


        calltrackingdata[73][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[73][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[73][2]="+389623920073";

        calltrackingdata[73][3]="Да";


        calltrackingdata[74][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[74][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[74][2]="+389623920074";

        calltrackingdata[74][3]="Да";

        calltrackingdata[75][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[75][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[75][2]="+389623920075";

        calltrackingdata[75][3]="Да";


        calltrackingdata[76][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[76][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[76][2]="+389623920076";

        calltrackingdata[76][3]="Да";


        calltrackingdata[77][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[77][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[77][2]="+389623920077";

        calltrackingdata[77][3]="Да";


        calltrackingdata[78][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[78][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[78][2]="+389623920078";

        calltrackingdata[78][3]="Да";


        calltrackingdata[79][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[79][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[79][2]="+389623920079";

        calltrackingdata[79][3]="Да";


        calltrackingdata[80][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[80][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[80][2]="+389623920080";

        calltrackingdata[80][3]="Да";


        calltrackingdata[81][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[81][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[81][2]="+389623920081";

        calltrackingdata[81][3]="Да";


        calltrackingdata[82][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[82][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[82][2]="+389623920082";

        calltrackingdata[82][3]="Да";


        calltrackingdata[83][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[83][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[83][2]="+389623920083";

        calltrackingdata[83][3]="Да";


        calltrackingdata[84][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[84][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[84][2]="+389623920084";

        calltrackingdata[84][3]="Да";


        calltrackingdata[85][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[85][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[85][2]="+389623920085";

        calltrackingdata[85][3]="Да";


        calltrackingdata[86][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[86][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[86][2]="+389623920086";

        calltrackingdata[86][3]="Да";


        calltrackingdata[87][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[87][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[87][2]="+389623920087";

        calltrackingdata[87][3]="Да";


        calltrackingdata[88][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[88][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[88][2]="+389623920088";

        calltrackingdata[88][3]="Да";


        calltrackingdata[89][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[89][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[89][2]="+389623920089";

        calltrackingdata[89][3]="Да";


        calltrackingdata[90][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[90][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[90][2]="+389623920090";

        calltrackingdata[90][3]="Да";


        calltrackingdata[91][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[91][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[91][2]="+389623920091";

        calltrackingdata[91][3]="Да";


        calltrackingdata[92][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[92][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[92][2]="+389623920092";

        calltrackingdata[92][3]="Да";


        calltrackingdata[93][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[93][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[93][2]="+389623920093";

        calltrackingdata[93][3]="Да";


        calltrackingdata[94][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[94][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[94][2]="+389623920094";

        calltrackingdata[94][3]="Да";


        calltrackingdata[95][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[95][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[95][2]="+389623920095";

        calltrackingdata[95][3]="Да";


        calltrackingdata[96][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[96][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[96][2]="+389623920096";

        calltrackingdata[96][3]="Да";


        calltrackingdata[97][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[97][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[97][2]="+389623920097";

        calltrackingdata[97][3]="Да";


        calltrackingdata[98][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[98][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[98][2]="+389623920098";

        calltrackingdata[98][3]="Да";


        calltrackingdata[99][0]="Тест";
// Enter data to row 1 column 0
        calltrackingdata[99][1]="test@i.ru";
// return arrayobject to testscript
        calltrackingdata[99][2]="+389623920099";

        calltrackingdata[99][3]="Да";

































        return calltrackingdata;
    }




}
